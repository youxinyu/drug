package com.guigu.drug.tanlong.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.tanlong.pojo.ClientInfo;
import com.guigu.drug.tanlong.pojo.DrugInfo;
import com.guigu.drug.tanlong.pojo.Finance;
import com.guigu.drug.tanlong.pojo.Sell;
import com.guigu.drug.tanlong.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SellController {

    @Autowired
    private DrugrecordService dao;

    @Autowired
    private DrugInfoService info;

    @Autowired
    private FinanceService finance;

    @Autowired
    private SellService sell;

    //销售
    @RequestMapping("/tanlong/selladd.do")
    public int selladd(HttpServletRequest request,int id,int count,int cid,int stocks,double prices) throws  Exception{

        // 采购是进货价
        // 销售是售货价

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dates = df.format(new Date());// new Date()为获取当前系统时间

        //根据id拿到药品总数量减去销售数量
        DrugInfo druginfoselid = info.druginfoselid(new DrugInfo(id));
        int drugstock = druginfoselid.getDrugstock();
        //药品减去销售数量
        int druginfoupd = info.druginfoupd(new DrugInfo(id,(drugstock - count)));

        //公司金额
        Finance financesel = finance.financesel();
        double blance = financesel.getBlance();
        //销售的总金额
        double price =count * prices;
        //公司金额加上销售的总金额
        int financeupd = finance.financeupd(new Finance((blance + price)));

        System.out.println(id+","+cid+","+count+","+price+dates+"可退货");

            //添加销售记录
           int  selladd = sell.selladd(new Sell(id,cid,count,price,dates,"可退货"));

            /*sell.sellupd(new Sell(id));*/

        return selladd;
    }

    // 查询销售可退货表
    @RequestMapping("/tanlong/selllist.do")
    public Map selllist(int page, int rows, DrugInfo d, ClientInfo c){


        System.out.println(page+"---------------"+rows);

        Sell sell = new Sell();
        sell.setD(d);
        sell.setC(c);

        Map map = new HashMap();
        PageHelper.startPage(page,rows);
        List<Sell> selllist = this.sell.selllist();
        PageInfo info = new PageInfo<>(selllist);
        map.put("rows", selllist);
        map.put("total", info.getLastPage());

        return map;
    }

    // 改销售退出表状态
    @RequestMapping("/tanlong/sellupd2.do")
    public int sellupd2(int sellid,int did,double price,int rquantity){

        //根据id拿到药品总数量加上  销售数量
        DrugInfo druginfoselid = info.druginfoselid(new DrugInfo(did));
        int drugstock = druginfoselid.getDrugstock();
        System.out.println(drugstock);
        System.out.println(drugstock+rquantity);
        int druginfoupd = info.druginfoupd(new DrugInfo(did,(drugstock+rquantity)));

        //公司金额减去销售赚的金额
        Finance financesel = finance.financesel();
        double blance = financesel.getBlance();
        int financeupd = finance.financeupd(new Finance((blance-price)));

        //修改状态
        int i = sell.sellupd2(new Sell(sellid));
        return i;
    }

}
