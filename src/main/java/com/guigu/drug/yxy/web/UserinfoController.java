package com.guigu.drug.yxy.web;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.guigu.drug.yxy.domain.Dept;
import com.guigu.drug.yxy.domain.Role;
import com.guigu.drug.yxy.domain.Userinfo;
import com.guigu.drug.yxy.service.UserinfoService;
import org.apache.shiro.SecurityUtils;
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
        /*HttpSession session = request.getSession();
        Subject subject= SecurityUtils.getSubject();
        if (!subject.isAuthenticated()){
            UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
            try{
                subject.login(token);
                lo = service.finduserinfobyaccount(user);
                session.setAttribute("staffinfo", lo);
                return lo;
            }catch(AuthenticationException e) {
                e.printStackTrace();
                return 0;
            }
        }else {
            Staff attribute = (Staff) session.getAttribute("staffinfo");
            System.out.println(attribute);
            return attribute;
        }*/
        Userinfo userinfo = service.finduserinfobyaccount(user);
        ByteSource bytes=ByteSource.Util.bytes(user.getAccount());

        int i=0;
        if(userinfo!=null){
            Object obj=new SimpleHash("MD5",userinfo.getPassword(), bytes, 1024);
            i=userinfo.getPassword().equals(obj.toString())?1:0;
        }
        return i;
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
