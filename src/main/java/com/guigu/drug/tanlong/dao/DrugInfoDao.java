package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.DrugInfo;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
@Mapper
public interface DrugInfoDao {

    //药品 新增
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
