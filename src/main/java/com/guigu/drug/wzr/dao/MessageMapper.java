package com.guigu.drug.wzr.dao;

import com.guigu.drug.wzr.domain.Druginfo;
import com.guigu.drug.wzr.domain.DrugwzrVo;
import com.guigu.drug.wzr.domain.Styledrug;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MessageMapper {

    //药品信息查询
    List<Druginfo> drugselectwzr(DrugwzrVo vo);
    //所有药品类型
    List<Styledrug> typedrugall();

}
