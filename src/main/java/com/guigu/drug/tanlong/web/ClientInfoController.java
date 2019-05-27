package com.guigu.drug.tanlong.web;

import com.guigu.drug.tanlong.pojo.ClientInfo;
import com.guigu.drug.tanlong.service.ClientinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientInfoController {
    @Autowired
    private ClientinfoService dao;

    @RequestMapping("/tanlong/clientlist.do")
    public List<ClientInfo> clientlist(){
        List<ClientInfo> clientlist = dao.clientlist();
        return clientlist;
    }

}
