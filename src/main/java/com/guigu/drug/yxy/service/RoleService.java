package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;

import java.util.List;

public interface RoleService {
    List<Role> findrole(Role role);
    Role findrolebyrid(int id);
    int addrole(Role role);
    int updaterole(Role role);
    int deleterole(int rid);
    List<Userinfo> finduserinfobyrid(int rid);
}
