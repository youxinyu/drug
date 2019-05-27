package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.pojo.DrugInfo;
import com.guigu.drug.tanlong.dao.DrugInfoDao;
import com.guigu.drug.tanlong.service.DrugInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugInfoImpol implements DrugInfoService {

    @Autowired
    private DrugInfoDao dao;


    @Override
    public int druginfoins(DrugInfo info) {
        int druginfoins = dao.druginfoins(info);
        return druginfoins;
    }

    @Override
    public List<DrugInfo> druginfosel() {
        List<DrugInfo> druginfosel = dao.druginfosel();
        return druginfosel;
    }

    @Override
    public List<DrugInfo> druginfosel2() {
        List<DrugInfo> drugInfos = dao.druginfosel2();
        return drugInfos;
    }

    @Override
    public int druginfoupd(DrugInfo d) {
        int druginfoupd = dao.druginfoupd(d);
        return druginfoupd;
    }

    @Override
    public DrugInfo druginfoselid(DrugInfo d) {
        DrugInfo info = dao.druginfoselid(d);
        return info;
    }

}
