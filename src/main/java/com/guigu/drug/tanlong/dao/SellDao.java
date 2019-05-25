package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.Sell;

import java.util.List;

public interface SellDao {

    //添加销售记录表
    int selladd(Sell s);

    //修改状态 改成不可退货
    int sellupd(Sell s);

    //修改状态 改成已退货
    int sellupd2(Sell s);

    //查询
    List<Sell> selllist();
}
