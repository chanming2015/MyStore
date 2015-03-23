/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved.
 */
/**
 * 
 */
package com.dyr.web.logined;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dyr.dao.service.UserInfoService;
import com.dyr.entity.PageBean;
import com.dyr.entity.UserInfo;

/**
 * NewBlush Project:MyStore Package:com.dyr.web.logined
 * FileName:LoginedUserInfoServlet.java Comments: JDK Version: Author:鏋楁灄 Create
 * Date:2015-1-21 涓婂崍9:17:15 Modified By:鏋楁灄 Modified Time: What is Modified:
 * Version
 */
public class LoginedadminServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String op = null;
	private UserInfoService userInfoService = new UserInfoService();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		op = request.getParameter("op");
		if ("toaddadmin".equals(op)) {
			toaddadmin(request, response);
		} else if ("addadmin".equals(op)) {
			addadmin(request, response);
		} else if ("showadmininfo".equals(op)) {
			showadmininfo(request, response);
		} else if ("toupdateadmin".equals(op)) {
			toupdateadmin(request, response);
		} else if ("updateadmin".equals(op)) {
			updateadmin(request, response);
		}else if("logout".equals(op)){
			logout(request,response);
		}
	}

	/**
	 *@author linlin
	 *Create Time:2015-1-21 上午11:31:56
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void logout(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("admin");
		String projectName=(String) request.getServletContext().getAttribute("projectName");
		response.sendRedirect("/"+projectName+"/UserInfoServlet?op=admintologin");
		
	}

	private void updateadmin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute(
				"admin");
		String uPassword = request.getParameter("repassword");
		int row = userInfoService.modifyUpdate(uPassword, userInfo.getuName());
		if (row > 0) {
			response.sendRedirect("/MyStore/UserInfoServlet?op=admintologin");
		}
	}

	/**
	 * @author linlin Create Time:2015-1-15 涓嬪崍4:34:34 Description:
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void toupdateadmin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		UserInfo userInfo = (UserInfo) request.getSession().getAttribute(
				"admin");
		UserInfo admin = userInfoService.selectUserInfoByuName(userInfo
				.getuName());
		request.setAttribute("admin", admin);
		request.getRequestDispatcher(
				"/WEB-INF/page/admin/main/updateuserinfo.jsp").forward(request,
				response);

	}

	/**
	 * @author linlin Create Time:2015-1-14 涓嬪崍3:04:26 Description:
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */

	private void showadmininfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PageBean pageBean=new PageBean();
		String keyWord = request.getParameter("keyWord");
		try {
			int page = Integer.parseInt(request.getParameter("page"));
			pageBean.setPage(page);
			
		} catch (NumberFormatException e) {
		}
		if(keyWord!=null&&!"".equals(keyWord)){
			keyWord=new String(request.getParameter("keyWord").getBytes("ISO-8859-1"), "UTF-8");
			keyWord=new StringBuffer("%").append(keyWord).append("%").toString();
			List<UserInfo> userinfolist = userInfoService.selectadminListByKeyWord(keyWord,pageBean.getPage(), pageBean.getRows());
			pageBean.setRowsCount(userInfoService.selectadminCountBykeyWord(keyWord));
			pageBean.setPagesCount();
			pageBean.setDataList(userinfolist);
			request.setAttribute("userinfolist", userinfolist);
			request.setAttribute("pageBean", pageBean);
		}
		else{
		pageBean.setRowsCount(userInfoService.getadminCount());
		pageBean.setPagesCount();
		List<UserInfo> userinfolist = userInfoService.getadminListByPage(
				pageBean.getPage(), pageBean.getRows());
		pageBean.setDataList(userinfolist);
		request.setAttribute("userinfolist", userinfolist);
		request.setAttribute("pageBean", pageBean);
		}
		request.getRequestDispatcher(
				"/WEB-INF/page/admin/main/showuserinfo.jsp").forward(request,
				response);
	}

	/**
	 * @author linlin Create Time:2015-1-14 涓婂崍10:06:16 Description:
	 * @param request
	 * @param response
	 * @throws IOException
	 * @throws ServletException
	 */
	private void addadmin(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("uName");
		String upassword = request.getParameter("uPassword");
		String usex = request.getParameter("uSex");
		String uemail = request.getParameter("uEmail");
		String usafeQuestion = request.getParameter("uSafeQuestion");
		String usafeAnswer = request.getParameter("uSafeAnswer");
		String uidCard = request.getParameter("uIdCard");
		String urealName = request.getParameter("uRealName");
		UserInfo userInfo = new UserInfo(uname, upassword, usex, uemail,
				usafeQuestion, usafeAnswer, urealName, uidCard, 1);
		int row = userInfoService.register(userInfo);
		if (row > 0) {
			request.getRequestDispatcher("LoginedadminServlet?op=showadmininfo")
					.forward(request, response);
		} else {
			response.sendRedirect("register.jsp");
		}

	}

	private void toaddadmin(HttpServletRequest request,
			HttpServletResponse response) throws IOException, ServletException {
		request.getRequestDispatcher("/WEB-INF/page/admin/main/addnewuser.jsp")
				.forward(request, response);

	}
}
