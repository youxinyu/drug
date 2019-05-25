package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.dao.UserinfoMapper;
import com.guigu.drug.yxy.domain.Dept;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserinfoImpol implements UserinfoService{
    @Autowired
    private UserinfoMapper mapper;
    public Userinfo finduserinfobyaccount(Userinfo user) {
        return mapper.finduserinfobyaccount(user);
    }

    public Userinfo finduserinfobyuserid(int userid) {
        return mapper.finduserinfobyuserid(userid);
    }

    public List<Userinfo> finduserinfo(Userinfo user) {
        return mapper.finduserinfo(user);
    }

    public int adduserinfo(Userinfo user) {
        return mapper.adduserinfo(user);
    }

    public int updateuserinfo(Userinfo user) {
        return mapper.updateuserinfo(user);
    }

    public List<Dept> finddept() {
        return mapper.finddept();
    }


}
