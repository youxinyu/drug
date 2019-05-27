package com.guigu.drug.yxy.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class RoleController {
    @Autowired
    private RoleService service;
    @RequestMapping("/yxy/findrole.do")
    public List<Role> findrole(){
        return service.findrole(new Role(0,"","",0,""));
    }
    @RequestMapping("/yxy/findrolebyrid.do")
    public Role findrolebyrid(int rid){
        return service.findrolebyrid(rid);
    }
    @RequestMapping("/yxy/findroles.do")
    public Map findroles(Role role, HttpServletRequest request){
        String page1 = request.getParameter("page");
        String rows1 = request.getParameter("rows");
        PageHelper.startPage(Integer.parseInt(page1), Integer.parseInt(rows1));
        List<Role> list = service.findrole(role);
        PageInfo info = new PageInfo(list);
        Map map=new HashMap();
        map.put("rows", list);
        map.put("total",info.getLastPage());
        return map;
    }
    @RequestMapping("/yxy/addrole.do")
    public int addrole(Role role) {
        return service.addrole(role);
    }

    @RequestMapping("/yxy/updaterole.do")
    public int updaterole(Role role) {
        return service.updaterole(role);
    }
}
