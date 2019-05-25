package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.dao.FinanceDao;
import com.guigu.drug.tanlong.pojo.Finance;
import com.guigu.drug.tanlong.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceImpol implements FinanceService {

    @Autowired
    private FinanceDao dao;

    @Override
    public int financeupd(Finance f) {
        int financeupd = dao.financeupd(f);
        return financeupd;
    }

    @Override
    public Finance financesel() {
        Finance financesel = dao.financesel();
        return financesel;
    }
}
