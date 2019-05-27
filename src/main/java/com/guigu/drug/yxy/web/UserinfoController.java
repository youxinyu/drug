package com.guigu.drug.yxy.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.yxy.domain.Dept;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import com.guigu.drug.yxy.service.UserinfoService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserinfoController {
    @Autowired
    private UserinfoService service;

    @RequestMapping("/yxy/finduserinfobyaccount.do")
    public Userinfo finduserinfobyaccount(Userinfo user){
        return service.finduserinfobyaccount(user);
    }

    @RequestMapping("/yxy/finduserinfobyuserid.do")
    public Userinfo finduserinfobyuserid(int userid){
        return service.finduserinfobyuserid(userid);
    }

    @RequestMapping("/yxy/login.do")
    public int login(Userinfo user,HttpServletRequest request){
        HttpSession session = request.getSession();
        Subject subject= SecurityUtils.getSubject();
        Userinfo userinfo=null;
        if (!subject.isAuthenticated()){
            ByteSource bytes=ByteSource.Util.bytes(user.getAccount());
            Object obj=new SimpleHash("MD5",user.getPassword(), bytes, 1024);
            UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(),obj.toString());
            try{
                subject.login(token);
                userinfo = service.finduserinfobyaccount(user);
                session.setAttribute("userinfo", userinfo);
                return 1;
            } catch (UnknownAccountException e){
                System.out.println("用户名不存在！");
                return 3;
            }catch (LockedAccountException e){
                System.out.println("用户已离职！");
                return 4;
            }catch(AuthenticationException e) {
                System.out.println("密码错误！");
                return 2;
            }
        }
        return 0;
    }

    @RequestMapping("/yxy/finduserinfo.do")
    public Map finduserinfo(Userinfo user, HttpServletRequest request){
        String page1 = request.getParameter("page");
        String rows1 = request.getParameter("rows");
        PageHelper.startPage(Integer.parseInt(page1), Integer.parseInt(rows1));
        List<Userinfo> list = service.finduserinfo(user);
        PageInfo info = new PageInfo(list);
        Map map=new HashMap();
        map.put("rows", list);
        map.put("total",info.getLastPage());
        return map;
    }

    @RequestMapping("/yxy/finddept.do")
    public List<Dept> finddept(){
        return service.finddept();
    }

    @RequestMapping("/yxy/adduser.do")
    public int add(Userinfo user){
        ByteSource bytes=ByteSource.Util.bytes(user.getAccount());
        Object obj=new SimpleHash("MD5","123456", bytes, 1024);
        user.setPassword(obj.toString());
        return service.adduserinfo(user);
    }

    @RequestMapping("/yxy/updateuser.do")
    public int updateuserinfo(Userinfo user) {
        return service.updateuserinfo(user);
    }


}
