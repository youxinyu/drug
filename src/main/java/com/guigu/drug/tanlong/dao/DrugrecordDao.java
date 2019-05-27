package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.Drugrecord;

import java.util.List;

public interface DrugrecordDao {

    //新增采购数据
    int cordadd(Drugrecord d);

    //查询可退货数据
    List<Drugrecord> cordsel(Drugrecord d);

    //点击退货修改状态
    int cordupd(Drugrecord d);

    //根据id拿到数量 总数量减采购数量
    Drugrecord cordselid(Drugrecord d);
}
