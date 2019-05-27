package com.guigu.drug.tanlong.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.tanlong.pojo.*;
import com.guigu.drug.tanlong.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@RestController
public class DrugrecordController {

        @Autowired
        private DrugrecordService dao;

        @Autowired
        private DrugInfoService info;

        @Autowired
        private FinanceService finance;

        @Autowired
        private SalesService sales;

        @RequestMapping("/tanlong/cordadd.do")
        public int  cordadd(int ids,String count,int selid,double dprice) throws ParseException {
            double counts = Double.parseDouble(count);
            int cnt = Integer.parseInt(count);
            double dprices = counts * dprice;

            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
            String dates = df.format(new Date());// new Date()为获取当前系统时间

            DrugInfo druginfoselid = info.druginfoselid(new DrugInfo(ids));
            String drugproductdate = druginfoselid.getDrugproductdate();//生产日期
            int drugbaozhiqi = druginfoselid.getDrugbaozhiqi();//保质期


            int lnian = Integer.parseInt(drugproductdate.substring(0,4).toString());
            int lyue = Integer.parseInt(drugproductdate.substring(5,7).toString());
            int y = lyue + drugbaozhiqi;

            int lri = Integer.parseInt(drugproductdate.substring(8,10).toString());
            if(y>12){
                y=1;
                lnian++;
            }

            String df4 = (lnian+"-"+y+"-"+lri).toString();

            System.out.println(df4+"保质期");
            System.out.println(dates+"当前日期");


            int cordadd=0;
            System.out.println(df4.compareTo(dates)>0);
            if(df4.compareTo(dates)>0){
                //代表过期时间大于当前时间  没过期可以退货
                cordadd = dao.cordadd(new Drugrecord(ids,selid,1,cnt,dprices,dates,"可退货"));
            }else{
                //代表过期时间小于当前时间 过期了不可以退货
                cordadd = dao.cordadd(new Drugrecord(ids,selid,1,cnt,dprices,dates,"不可退货"));
            }


            /*if (bt.before(et)){
                //表示bt小于et 代表过期时间大于当前时间  没过期可以退货
                cordadd = dao.cordadd(new Drugrecord(ids,selid,1,cnt,dprices,dates,"可退货"));
            }else{
                //表示bt大于et 代表过期时间大于当前时间 过期了不可以退货
                cordadd = dao.cordadd(new Drugrecord(ids,selid,1,cnt,dprices,dates,"不可退货"));
            }*/


            return cordadd;
        }

    @RequestMapping("/tanlong/cordsel.do")
    public Map cordsel(int page,int rows,DrugInfo i,SupplierInfo f){

        Drugrecord drugrecord = new Drugrecord();
        drugrecord.setI(i);
        drugrecord.setF(f);
        drugrecord.setRstatus("可退货");
        Map map = new HashMap();
        PageHelper.startPage(page, rows);
        List<Drugrecord> cordsel = dao.cordsel(drugrecord);
        PageInfo info = new PageInfo<>(cordsel);
        map.put("rows", cordsel);
        map.put("total", info.getLastPage());
        System.out.println(cordsel);
        return map;
    }

    //退货
    @RequestMapping("/tanlong/cordupd.do")
    public int cordupd(int rdid,int did,double price,int rquantity,int supplierid){

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String dates = df.format(new Date());// new Date()为获取当前系统时间

        //根据id拿到药品总数量减去采购数量
        DrugInfo druginfoselid = info.druginfoselid(new DrugInfo(did));
        int drugstock = druginfoselid.getDrugstock();

        int druginfoupd = info.druginfoupd(new DrugInfo(did,(drugstock-rquantity)));

        //公司金额减去采购的总金额
        Finance financesel = finance.financesel();
        double blance = financesel.getBlance();

        int financeupd = finance.financeupd(new Finance((blance-price)));

        //退货改状态
        int cordupd = dao.cordupd(new Drugrecord(rdid));

        //新增退货语句
        sales.salesadd(new Sales(did,supplierid,1,rquantity,price,dates));

        return cordupd;
    }

}
