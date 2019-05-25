package com.guigu.drug.tanlong.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.tanlong.pojo.DrugInfo;
import com.guigu.drug.tanlong.service.DrugInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DruginfoController {

    @Autowired
    private DrugInfoService dao;

    @RequestMapping("/tanlong/druginfoins.do")  //药品采购 新增
    public int druginfoins(String drugbarcode,String drugname,String drugabbreviation,String drugspecification,String drugunit,String drugproduceaddress,String drugapprovalnumber,double drugbuyingprice,double drugsellingprice,int drugstock,int dugbaozhiqi,String drugproductdate){

        int druginfoins = dao.druginfoins(new DrugInfo(drugbarcode,drugname,drugabbreviation,drugspecification,drugunit,drugproduceaddress,drugapprovalnumber,drugbuyingprice,drugsellingprice,drugstock,dugbaozhiqi,drugproductdate));

        return druginfoins;
    }

    @RequestMapping("/tanlong/druginfosel.do")  //药品查询
    public Map druginfosel(int page,int rows){

        Map map = new HashMap();
        PageHelper.startPage(page,rows);
        List<DrugInfo> druginfosel = dao.druginfosel();
        PageInfo info = new PageInfo<>(druginfosel);
        map.put("rows", druginfosel);
        map.put("total", info.getLastPage());
        System.out.println(druginfosel);
        return map;
    }

    @RequestMapping("/tanlong/druginfosel2.do")  //药品查询
    public Map druginfosel2(int page,int rows){

        Map map = new HashMap();
        PageHelper.startPage(page,rows);
        List<DrugInfo> druginfosel2 = dao.druginfosel2();
        PageInfo info = new PageInfo<>(druginfosel2);
        map.put("rows", druginfosel2);
        map.put("total", info.getLastPage());
        System.out.println(druginfosel2);
        return map;
    }

    @RequestMapping("/tanlong/druginfoupd.do")  //药品采购 数量+
    public int druginfoupd(int ids,int stock,int count){

        int druginfoupd = dao.druginfoupd(new DrugInfo(ids,(stock+count)));

        return druginfoupd;
    }

    @RequestMapping("/tanlong/druginfosels.do")  //药品采购 数量+
    public DrugInfo druginfosels(int id){

        DrugInfo druginfoselid = dao.druginfoselid(new DrugInfo(id));

        return druginfoselid;
    }
}
