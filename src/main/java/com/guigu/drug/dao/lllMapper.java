package com.guigu.drug.dao;

import com.guigu.drug.pojo.lll;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface lllMapper {
    List<lll> findlll();
}
