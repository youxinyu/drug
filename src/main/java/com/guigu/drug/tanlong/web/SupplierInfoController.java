package com.guigu.drug.tanlong.web;

import com.guigu.drug.tanlong.pojo.SupplierInfo;
import com.guigu.drug.tanlong.service.SupplierInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SupplierInfoController {

    @Autowired
    private SupplierInfoService dao;

    @RequestMapping("/tanlong/suppins.do")
    public List<SupplierInfo> suppins(){

        List<SupplierInfo> suppsel = dao.suppsel();

        return suppsel;
    }

}
