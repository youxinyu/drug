package com.guigu.drug.wzr.dao;

import com.guigu.drug.wzr.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    //药品信息查询
    List<Druginfo> drugselectwzr(DrugwzrVo vo);
    //所有药品类型
    List<Styledrug> typedrugall();

    //供应商信息查询
    List<Supplierinfo> supplierselect(SupplierVo vo);

    //客户信息查询
    List<Clientinfo> clientselect(Clientinfo info);

    //采购入库信息查询
    List<Drugrecord> drugrecordselect(DrugrecordVo vo);

    //采购退货信息查询
    List<Sales> sellreturnwzr(SalesVo vo);

}
