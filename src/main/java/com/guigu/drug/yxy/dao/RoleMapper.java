package com.guigu.drug.yxy.dao;

import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface RoleMapper {
    List<Role> findrole(Role role);
    Role findrolebyrid(int id);
    int addrole(Role role);
    int updaterole(Role role);
    int deleterole(int rid);
    List<Userinfo> finduserinfobyrid(int rid);
}
