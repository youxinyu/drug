package com.guigu.drug.yxy.dao;

import com.guigu.drug.yxy.domain.Treenav;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TreenavMapper {
    List<Treenav> findtreenavbynid(int nid);
}
