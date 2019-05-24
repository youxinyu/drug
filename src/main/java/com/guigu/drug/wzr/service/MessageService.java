package com.guigu.drug.wzr.service;

import com.guigu.drug.wzr.domain.Druginfo;
import com.guigu.drug.wzr.domain.DrugwzrVo;
import com.guigu.drug.wzr.domain.Styledrug;

import java.util.List;

public interface MessageService {

    //药品信息查询
    List<Druginfo> drugselectwzr(DrugwzrVo vo);
    //所有药品类型
    List<Styledrug> typedrugall();
}
