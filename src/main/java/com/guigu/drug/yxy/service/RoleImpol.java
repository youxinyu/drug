package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.dao.RoleMapper;
import com.guigu.drug.yxy.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleImpol implements RoleService{
    @Autowired
    private RoleMapper mapper;
    public List<Role> findrole() {
        return mapper.findrole();
    }
}
