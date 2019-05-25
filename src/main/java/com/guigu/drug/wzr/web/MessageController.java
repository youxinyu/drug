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
        map.put("rows",drugselectwzr);
        map.put("total",info.getLastPage());
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
        Map map = new HashMap();
        map.put("rows",supplierselect);
        map.put("total",pa.getLastPage());
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
        Map map = new HashMap();
        map.put("rows",clientselect);
        map.put("total",pa.getLastPage());
        return map;
    }

    //采购入库查询
    @RequestMapping("drugrecordselect")
    public Map drugrecordselect(int page,String name,String uname,Integer rdid,Integer caigouid,String chandi){
        System.out.println(rdid);
        Map map = new HashMap();
        Supplierinfo su = new Supplierinfo();
        su.setSuppliername(name);
        Druginfo drug = new Druginfo();
        drug.setDrugname(uname);
        drug.setDrugid(rdid);
        drug.setDrugproduceaddress(chandi);
        Drugrecord drugrecord = new Drugrecord();
        drugrecord.setRdid(caigouid);
        PageHelper.startPage(page,5);
        List<Drugrecord> drugrecordselect = m.drugrecordselect(new DrugrecordVo(drugrecord, su, drug));
        PageInfo <Drugrecord> pa = new PageInfo<>(drugrecordselect);
        map.put("rows",drugrecordselect);
        map.put("total",pa.getLastPage());
        return map;
    }
}
