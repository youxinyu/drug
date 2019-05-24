package com.guigu.drug.wzr.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.wzr.domain.*;
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

    //药品信息查询
    @RequestMapping("drugselectwzr")
    public Map drugselectwzr(int page,String drugname,String drugbarcode,String typeidd,String date1,String date2){
        Map map = new HashMap();
        Druginfo druginfo = new Druginfo();
        druginfo.setDrugbarcode(drugbarcode);
        druginfo.setDrugname(drugname);
        Styledrug styledrug = new Styledrug();
        styledrug.setTypeidd(typeidd);
        PageHelper.startPage(page,5);
        List<Druginfo> drugselectwzr = m.drugselectwzr(new DrugwzrVo(druginfo,styledrug,date1,date2));
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

    //药品类型
    @RequestMapping("typedrugall")
    public List<Styledrug> typedrugall(){
        List<Styledrug> typedrugall = m.typedrugall();
        return typedrugall;
    }

    //供应商信息查询
    @RequestMapping("supplierselect")
    public Map supplierselect(int page,String name,String uname,String dizhi,String chuanzhen,String phone){
        Supplierinfo info = new Supplierinfo();
        info.setSuppliername(name);
        info.setSupplierpinyin(uname);
        info.setSupplieraddress(dizhi);
        info.setSupplierfax(chuanzhen);
        info.setSupplierphone(phone);
        PageHelper.startPage(page,5);
        List<Supplierinfo> supplierselect = m.supplierselect(new SupplierVo(info));
        PageInfo <Supplierinfo> pa = new PageInfo<>(supplierselect);
        int total = (int)pa.getTotal();
        int num = 0;
        if(total%5==0){
            num=total/5;
        }else{
            num=total/5+1;
        }
        Map map = new HashMap();
        map.put("rows",supplierselect);
        map.put("total",num);
        return map;
    }

    //客户信息查询
    @RequestMapping("clientselect")
    public Map clientselect(int page,String name,String uname,String dizhi,String chuanzhen,String phone){
        Clientinfo info = new Clientinfo();
        info.setClientname(name);
        info.setClientpinyin(uname);
        info.setClientaddress(dizhi);
        info.setClientfax(chuanzhen);
        info.setClientphone(phone);
        PageHelper.startPage(page,5);
        List<Clientinfo> clientselect = m.clientselect(info);
        PageInfo <Clientinfo> pa = new PageInfo<>(clientselect);
        int total = (int)pa.getTotal();
        int num = 0;
        if(total%5==0){
            num=total/5;
        }else{
            num=total/5+1;
        }
        Map map = new HashMap();
        map.put("rows",clientselect);
        map.put("total",num);
        return map;
    }
}
