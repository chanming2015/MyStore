/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Project:MyStore
 * Package:com.dyr.listener
 * FileName:MyListener.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-8 下午4:29:59
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class MyListener implements ServletContextListener{
	
	private ServletContext application;

	public void contextDestroyed(ServletContextEvent sce) {
	}

	public void contextInitialized(ServletContextEvent sce) {
		
		//得到公共区域
		application=sce.getServletContext();
		//得到工程路径
		String webRootPath=application.getRealPath("");
		//得到工程名称
		String projectName=webRootPath.substring(webRootPath.lastIndexOf("\\") + 1);
		application.setAttribute("projectName", projectName);
	}

}
