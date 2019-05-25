package com.guigu.drug.yxy.dao;

import com.guigu.drug.yxy.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleMapper {
    List<Role> findrole();
}
