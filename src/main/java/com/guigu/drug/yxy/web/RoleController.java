package com.guigu.drug.yxy.web;

import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoleController {
    @Autowired
    private RoleService service;
    @RequestMapping("/yxy/findrole.do")
    public List<Role> findrole(){
        return service.findrole();
    }
}
