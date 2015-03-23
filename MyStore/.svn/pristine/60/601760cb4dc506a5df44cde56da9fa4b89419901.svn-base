/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.web.logined;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.dyr.dao.service.UserInfoService;
import com.dyr.entity.UserInfo;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.web.logined
 *FileName:LoginedUserServlet.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-21 上午9:28:15
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public class LoginedUserServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private String op = null;
	private UserInfoService userInfoService = new UserInfoService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
		
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		op=request.getParameter("op");
		if ("modifyUpdate".equals(op)) {
			modifyUpdate(request, response);
		}else if("logout".equals(op)){
			logout(request,response);
		}else if("showuserinfo".equals(op)){
			showuserinfo(request,response);
		}else if("toupdateuser".equals(op)){
			toupdateuser(request,response);
		}else if("updateuser".equals(op)){
			modifyUpdate(request,response);
		}
	}
	
	


	/**
	 *@author linlin
	 *Create Time:2015-1-21 下午3:24:32
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void toupdateuser(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher(
				"/WEB-INF/page/user/main/userPosenData1.jsp").forward(request,
				response);
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-21 下午2:42:02
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void showuserinfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute(
				"user");
		UserInfo user = userInfoService.selectUserByuName(userInfo
				.getuName());
		request.setAttribute("user", user);
		request.getRequestDispatcher(
				"/WEB-INF/page/user/main/userPosenData.jsp").forward(request,
				response);
	}


	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("user");
		request.getRequestDispatcher(
				"../UserInfoServlet").forward(request,
				response);
	}

	
	
	private void modifyUpdate(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession();
		UserInfo user = (UserInfo) session.getAttribute("user");
		String upassword = request.getParameter("uPassword");
		int row = userInfoService.modifyUpdate(upassword, user.getuName());
		if (row > 0) {
			session.removeAttribute("user");
			request.getRequestDispatcher(
					"../UserInfoServlet?op=usertologin").forward(request,
					response);
		} else {
			response.sendRedirect("erroe.jsp");
		}
	}
}
