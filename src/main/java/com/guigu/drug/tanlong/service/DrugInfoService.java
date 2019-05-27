package com.guigu.drug.tanlong.service;

import com.guigu.drug.tanlong.pojo.DrugInfo;

import java.util.List;

public interface DrugInfoService {

    //药品采购 新增
    int druginfoins(DrugInfo info);

    //查询药品低于50的
    List<DrugInfo> druginfosel();

    //查询所有药品
    List<DrugInfo> druginfosel2();

    //采购药品
    int druginfoupd(DrugInfo d);

    //根据id查询药品 获取药品时间判断过没过期 可不可以退货
    DrugInfo druginfoselid(DrugInfo d);
}
