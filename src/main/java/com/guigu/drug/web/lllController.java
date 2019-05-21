package com.guigu.drug.web;

import com.guigu.drug.pojo.lll;
import com.guigu.drug.service.lllService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class lllController {
    @Autowired
    private lllService service;

    @RequestMapping("/findlll.do")
    public List<lll> findlll(){
        return service.findlll();
    }


}
