/**
 * 
 */
package com.wenhao.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author wenhao
 *
 */
//@EnableWebSecurity
//@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/css/**","/js/**","fonts/**","/index").permitAll();//允许访问	
//			.antMatchers("/users/**").hasRole("ADMIN") //需要相应的角色才能访问
//			.and()
//			.formLogin() //基于form的表单验证
//			.loginPage("/login")//自定义登录界面
//			.failureUrl("/login-error");
	}
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth
			.inMemoryAuthentication() //认证信息存储在内存中
				.withUser("wenhao").password("111111").roles("ADMIN");
		
	}
}
