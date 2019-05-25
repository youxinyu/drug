package com.guigu.drug.tanlong.web;

import com.guigu.drug.tanlong.pojo.Finance;
import com.guigu.drug.tanlong.service.FinanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {

    @Autowired
    private FinanceService dao;

    @RequestMapping("/tanlong/financeupd.do")
    public int financeupd(String count,double dprice){
        double counts = Double.parseDouble(count);
        int cnt = Integer.parseInt(count);
        double dprices = counts * dprice;

        Finance financesel = dao.financesel();
        double blance = financesel.getBlance();

        int financeupd = dao.financeupd(new Finance((blance-dprices)));
        return financeupd;
    }

}
