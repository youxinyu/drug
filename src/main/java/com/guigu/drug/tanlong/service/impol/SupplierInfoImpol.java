package com.guigu.drug.tanlong.service.impol;


import com.guigu.drug.tanlong.dao.SupplierInfoDao;
import com.guigu.drug.tanlong.pojo.SupplierInfo;
import com.guigu.drug.tanlong.service.SupplierInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierInfoImpol implements SupplierInfoService {

        @Autowired
    private SupplierInfoDao dao;

    @Override
    public List<SupplierInfo> suppsel() {
        List<SupplierInfo> suppsel = dao.suppsel();
        return suppsel;
    }




}
