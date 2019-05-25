package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.SupplierInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface SupplierInfoDao {

    //查询供应商拿供应商所以用户
    List<SupplierInfo> suppsel();

}
