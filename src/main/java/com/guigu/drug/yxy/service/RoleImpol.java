package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.dao.RoleMapper;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleImpol implements RoleService{
    @Autowired
    private RoleMapper mapper;
    public List<Role> findrole(Role role) {
        return mapper.findrole(role);
    }

    @Override
    public Role findrolebyrid(int id) {
        return mapper.findrolebyrid(id);
    }

    @Override
    public int addrole(Role role) {
        return mapper.addrole(role);
    }

    @Override
    public int updaterole(Role role) {
        return mapper.updaterole(role);
    }

    @Override
    public int deleterole(int rid) {
        return mapper.deleterole(rid);
    }

    @Override
    public List<Userinfo> finduserinfobyrid(int rid) {
        return mapper.finduserinfobyrid(rid);
    }
}
