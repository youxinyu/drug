package com.guigu.drug.yxy.web;

import com.guigu.drug.yxy.domain.Treenav;
import com.guigu.drug.yxy.service.TreenavService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreenavController {
    @Autowired
    private TreenavService service;

    @RequestMapping("/yxy/findtreenavbynid.do")
    public List<Treenav> findtreenavbynid(int nid){
        return service.findtreenavbynid(nid);
    }

}
