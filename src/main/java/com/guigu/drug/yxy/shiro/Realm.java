package com.guigu.drug.yxy.shiro;

import com.guigu.drug.yxy.domain.Userinfo;
import com.guigu.drug.yxy.service.UserinfoService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;


public class Realm extends AuthorizingRealm{

	@Autowired
	private UserinfoService service;
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Object principal = principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		Userinfo user=new Userinfo();
		user.setAccount(principal.toString());
		Userinfo login =service.finduserinfobyaccount(user);
		authorizationInfo.addRole(login.getWorkstate());

		return authorizationInfo;
	}
	
	//认证
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		//获取Token对象
		UsernamePasswordToken token2=(UsernamePasswordToken) token;
		//调用service中的登录方法
		 Userinfo user=new Userinfo();
		 user.setAccount(token2.getUsername());
		Userinfo login =service.finduserinfobyaccount(user);
		 if(login == null){
	            throw new UnknownAccountException(); //没找到账号
		 }

		if (login.getWorkstate().equals("已离职")) {
			// 用户被管理员锁定抛出异常
			throw new LockedAccountException();
		}
		//shiro认证
		
		
		/*
		 * SimpleHash pwd=new SimpleHash("MD5",token2.getPassword(),null,1024);
		 * System.out.println("加密后"+pwd);
		 */
		
		 
		SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(
				login.getAccount(), login.getPassword(),getName());
		return info;
	}
}
