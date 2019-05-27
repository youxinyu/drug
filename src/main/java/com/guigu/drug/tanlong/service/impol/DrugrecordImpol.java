package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.dao.DrugrecordDao;
import com.guigu.drug.tanlong.pojo.Drugrecord;
import com.guigu.drug.tanlong.service.DrugrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugrecordImpol implements DrugrecordService {

    @Autowired
    private DrugrecordDao dao;

    @Override
    public int cordadd(Drugrecord d) {
        int cordadd = dao.cordadd(d);
        return cordadd;
    }

    @Override
    public List<Drugrecord> cordsel(Drugrecord d) {
        List<Drugrecord> cordsel = dao.cordsel(d);
        return cordsel;
    }

    @Override
    public int cordupd(Drugrecord d) {
        int cordupd = dao.cordupd(d);
        return cordupd;
    }

    @Override
    public Drugrecord cordselid(Drugrecord d) {
        Drugrecord cordselid = dao.cordselid(d);
        return cordselid;
    }
}
