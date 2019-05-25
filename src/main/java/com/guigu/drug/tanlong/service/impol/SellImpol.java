package com.guigu.drug.tanlong.service.impol;

import com.guigu.drug.tanlong.dao.SellDao;
import com.guigu.drug.tanlong.pojo.Sell;
import com.guigu.drug.tanlong.service.SellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellImpol implements SellService {

    @Autowired
    private SellDao dao;


    @Override
    public int selladd(Sell s) {
        int selladd = dao.selladd(s);
        return selladd;
    }

    @Override
    public int sellupd(Sell s) {
        int sellupd = dao.sellupd(s);
        return sellupd;
    }

    @Override
    public int sellupd2(Sell s) {
        int i = dao.sellupd2(s);
        return i;
    }

    @Override
    public List<Sell> selllist() {
        List<Sell> selllist = dao.selllist();
        return selllist;
    }
}
