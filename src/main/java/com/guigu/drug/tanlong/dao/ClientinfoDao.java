package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.ClientInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface ClientinfoDao {

        //查询客户表 拿到所有客户名字
        List<ClientInfo>  clientlist();

}
