package com.guigu.drug.service.impol;

import com.guigu.drug.dao.lllMapper;
import com.guigu.drug.pojo.lll;
import com.guigu.drug.service.lllService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class lllImpol implements lllService {
    @Autowired
    private lllMapper mappers;


    @Override
    public List<lll> findlll() {
        return mappers.findlll();
    }
}
