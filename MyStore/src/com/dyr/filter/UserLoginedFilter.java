/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Project:MyStore
 * Package:com.dyr.filter
 * FileName:LoginedUserFilter.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午11:21:43
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class UserLoginedFilter implements Filter{

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		//通过强制转换，得到HttpServletRequest
		HttpServletRequest request = (HttpServletRequest) req;
		//通过强制转换，得到HttpServletResponse
		HttpServletResponse response = (HttpServletResponse) resp;
		//判断是否有用户登录
		HttpSession httpSession = request.getSession();
		if (httpSession.getAttribute("user") != null) {
			// 用户已登录
			chain.doFilter(request, response);
		} else {
			// 用户未登录
			String projectName=(String) request.getServletContext().getAttribute("projectName");
			response.sendRedirect("/"+projectName+"/UserInfoServlet?op=usertologin");
		}	
	}

	public void init(FilterConfig filterConfig) throws ServletException {
	}

}
