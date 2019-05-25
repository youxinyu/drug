package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.dao.SalesDao;
import com.guigu.drug.tanlong.pojo.Sales;
import com.guigu.drug.tanlong.service.SalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesImpol implements SalesService {

    @Autowired
    private SalesDao dao;

    @Override
    public int salesadd(Sales s) {
        int salesadd = dao.salesadd(s);
        return salesadd;
    }
}
