package com.guigu.drug.wzr.service;

import com.guigu.drug.wzr.dao.MessageMapper;
import com.guigu.drug.wzr.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpol implements MessageService {

    @Autowired
    private MessageMapper mapper;

    @Override
    public List<Clientinfo> clientselect(Clientinfo info) {
        return mapper.clientselect(info);
    }

    @Override
    public List<Druginfo> drugselectwzr(DrugwzrVo vo) {
        List<Druginfo> drugselectwzr = mapper.drugselectwzr(vo);
        return drugselectwzr;
    }

    @Override
    public List<Styledrug> typedrugall() {
        List<Styledrug> typedrugall = mapper.typedrugall();
        return typedrugall;
    }

    @Override
    public List<Supplierinfo> supplierselect(SupplierVo vo) {
        List<Supplierinfo> supplierselect = mapper.supplierselect(vo);
        return supplierselect;
    }
}
