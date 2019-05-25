package com.guigu.drug.tanlong.service;

import com.guigu.drug.tanlong.pojo.Finance;

public interface FinanceService {

    //采购完公司账户扣钱
    int financeupd(Finance f);

    //查询公司账户信息
    Finance financesel();

}
