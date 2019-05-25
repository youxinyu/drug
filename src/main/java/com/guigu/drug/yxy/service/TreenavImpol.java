package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.dao.TreenavMapper;
import com.guigu.drug.yxy.domain.Treenav;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreenavImpol implements TreenavService{
    @Autowired
    private TreenavMapper mapper;

    public List<Treenav> findtreenavbynid(int nid) {
        return mapper.findtreenavbynid(nid);
    }
}
