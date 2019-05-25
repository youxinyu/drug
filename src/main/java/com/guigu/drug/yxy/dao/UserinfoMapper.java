package com.guigu.drug.yxy.dao;

import com.guigu.drug.yxy.domain.Dept;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserinfoMapper {
    Userinfo finduserinfobyaccount(Userinfo user);
    Userinfo finduserinfobyuserid(int userid);
    List<Userinfo> finduserinfo(Userinfo user);
    int adduserinfo(Userinfo user);
    int updateuserinfo(Userinfo user);
    List<Dept> finddept();

}
