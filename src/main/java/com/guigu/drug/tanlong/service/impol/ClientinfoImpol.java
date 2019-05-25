package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.pojo.ClientInfo;
import com.guigu.drug.tanlong.service.ClientinfoService;
import com.guigu.drug.tanlong.dao.ClientinfoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientinfoImpol implements ClientinfoService {

     @Autowired
    private ClientinfoDao dao;


    @Override
    public List<ClientInfo> clientlist() {
        List<ClientInfo> clientlist = dao.clientlist();
        return clientlist;
    }






}
