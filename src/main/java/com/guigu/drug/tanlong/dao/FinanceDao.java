package com.guigu.drug.tanlong.dao;

import com.guigu.drug.tanlong.pojo.Finance;

public interface FinanceDao {

   //采购完公司账户扣钱
   int financeupd(Finance f);

   //查询公司账户信息
   Finance financesel();

}
