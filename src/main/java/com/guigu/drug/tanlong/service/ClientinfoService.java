package com.guigu.drug.tanlong.service;

import com.guigu.drug.tanlong.pojo.ClientInfo;

import java.util.List;

public interface ClientinfoService {

    //查询客户表 拿到所有客户名字
    List<ClientInfo> clientlist();

}
