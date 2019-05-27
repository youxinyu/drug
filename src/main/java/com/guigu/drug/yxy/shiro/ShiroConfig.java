package com.guigu.drug.yxy.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import at.pollux.thymeleaf.shiro.dialect.ShiroDialect;

/**
 * Shiro的配置类
 * @author lenovo
 *
 */
@Configuration
public class ShiroConfig {

	/**
	 * 创建ShiroFilterFactoryBean
	 *//**
	 * Shiro内置过滤器，可以实现权限相关的拦截器
	 *    常用的过滤器：
	 *       anon: 无需认证（登录）可以访问
	 *       authc: 必须认证才可以访问
	 *       user: 如果使用rememberMe的功能可以直接访问
	 *       perms： 该资源必须得到资源权限才可以访问
	 *       role: 该资源必须得到角色权限才可以访问
	 */
	@Bean("hashedCredentialsMatcher")
    public HashedCredentialsMatcher hashedCredentialsMatcher() {
        HashedCredentialsMatcher credentialsMatcher = new HashedCredentialsMatcher();
        //指定加密方式为MD5
        credentialsMatcher.setHashAlgorithmName("MD5");
        //加密次数
        credentialsMatcher.setHashIterations(1024);
        credentialsMatcher.setStoredCredentialsHexEncoded(true);
        return credentialsMatcher;
    }

	
	
	@Bean                                                              
	public ShiroFilterFactoryBean getShiroFilterFactoryBean(@Qualifier("securityManager")DefaultWebSecurityManager securityManager){
		ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
		//设置安全管理器
		shiroFilterFactoryBean.setSecurityManager(securityManager);
		shiroFilterFactoryBean.setLoginUrl("/fuyou/login.html");
		//添加Shiro内置过滤器
		Map<String,String> filterMap = new LinkedHashMap<String,String>();
		/*filterMap.put("/add", "authc");
		filterMap.put("/update", "authc");*/
		
		filterMap.put("/*.js","anon");
		filterMap.put("/*.css", "anon");
		filterMap.put("/*.png","anon");
		filterMap.put("/*.jpeg","anon");
		filterMap.put("/*.jpg","anon");
		filterMap.put("/*.do","anon");
		filterMap.put("/wujunfan/login.*","anon");
		
		
		//放行login.html页面
		filterMap.put("/fuyou/login.html", "anon");
		filterMap.put("/web/stafflogin.do","anon");
		filterMap.put("/fangqi/YDmanagement/web/logout.do","logout");
		filterMap.put("/fuyou/login.jsp", "anon");
		

		 
		shiroFilterFactoryBean.setFilterChainDefinitionMap(filterMap);
		return shiroFilterFactoryBean;
		
	}
	
	/**
	 * 创建DefaultWebSecurityManager
	 */
	@Bean(name="securityManager")
	public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("userRealm")Realm Realm){
		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		//关联realm
		securityManager.setRealm(Realm);
		return securityManager;
	}
	
	/**
	 * 创建Realm
	 */
	@Bean(name="userRealm")
	public Realm getRealm(){
		return new Realm();
	} 
	
	/**
	 * 配置ShiroDialect，用于thymeleaf和shiro标签配合使用
	 */
	@Bean
	public ShiroDialect getShiroDialect(){
		return new ShiroDialect();
	}
}
