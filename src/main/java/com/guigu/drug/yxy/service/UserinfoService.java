package com.guigu.drug.yxy.service;

import com.guigu.drug.yxy.domain.Dept;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;

import java.util.List;

public interface UserinfoService {
    Userinfo finduserinfobyaccount(Userinfo user);
    Userinfo finduserinfobyuserid(int userid);
    List<Userinfo> finduserinfo(Userinfo user);
    int adduserinfo(Userinfo user);
    int updateuserinfo(Userinfo user);
    List<Dept> finddept();

}
