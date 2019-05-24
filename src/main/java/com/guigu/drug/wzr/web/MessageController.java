package com.guigu.drug.wzr.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.wzr.domain.Druginfo;
import com.guigu.drug.wzr.domain.DrugwzrVo;
import com.guigu.drug.wzr.domain.Styledrug;
import com.guigu.drug.wzr.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class MessageController {

    @Autowired
    private MessageService m;

    @RequestMapping("drugselectwzr")//药品信息查询
    public Map drugselectwzr(int page,String drugname,String drugbarcode,String typeidd,String date1,String date2){
        System.out.println("12123");
        Map map = new HashMap();
        Druginfo druginfo = new Druginfo();
        druginfo.setDrugbarcode(drugbarcode);
        druginfo.setDrugname(drugname);
        Styledrug styledrug = new Styledrug();
        styledrug.setTypeidd(typeidd);
        PageHelper.startPage(page,5);
        List<Druginfo> drugselectwzr = m.drugselectwzr(new DrugwzrVo(druginfo,styledrug,date1,date2));
        System.out.println(drugselectwzr);
        PageInfo <Druginfo> info = new PageInfo<>(drugselectwzr);
        int drugcount = (int) info.getTotal();
        int num = 0;
        if(drugcount%5==0){
            num=drugcount/5;
        }else{
            num=drugcount/5+1;
        }
        map.put("rows",drugselectwzr);
        map.put("total",num);
        return map;
    }

    @RequestMapping("typedrugall")
    public List<Styledrug> typedrugall(){
        List<Styledrug> typedrugall = m.typedrugall();
        return typedrugall;
    }
}
