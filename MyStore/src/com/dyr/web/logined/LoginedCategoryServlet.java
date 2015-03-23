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

import com.dyr.dao.service.CategoryService;
import com.dyr.entity.Category;
import com.dyr.entity.PageBean;
import com.dyr.entity.UserInfo;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.web
 *FileName:CategoryServlet.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-13 上午10:38:41
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
@SuppressWarnings("serial")
public class LoginedCategoryServlet extends HttpServlet {
	
	private String op=null;
	private CategoryService categoryService = new CategoryService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		op = request.getParameter("op");
		if("showCategory".equals(op)){
			showCategory(request,response);
		}else if("showCategoryList".equals(op)){
			showCategoryList(request,response);
		}else if("toaddnewCategory".equals(op)){
			toaddnewCategory(request,response);
		}else if("addnewCategory".equals(op)){
			addnewCategory(request,response);
		}else if("toupdateCategory".equals(op)){
			toupdateCategory(request,response);
		}else if("updateCategory".equals(op)){
			updateCategory(request,response);
		}else if("deleteCategory".equals(op)){
			deleteCategory(request,response);
		}
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-19 上午10:17:34
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void deleteCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String cIdStr = request.getParameter("cId");
		int cId  = Integer.parseInt(cIdStr);
//		String cRootStr = request.getParameter("cRoot");
//		int cRoot = Integer.parseInt(cRootStr);
		
		int row = categoryService.deleteCategiry(cId);
		if(row>0){
			request.getRequestDispatcher("LoginedCategoryServlet?op=showCategoryList&cRoot=1").forward(request, response);
		}
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-19 上午10:03:05
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void addnewCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String cName = request.getParameter("cName");
		String cRootStr = request.getParameter("cRoot");
		int cRoot = Integer.parseInt(cRootStr);
		String cAbout = request.getParameter("cAbout");
		Category category = new Category(cRoot,cName,cAbout);
		int row = categoryService.addnewCategory(category);
		if(row>0){
			request.getRequestDispatcher("LoginedCategoryServlet?op=showCategoryList&cRoot=1").forward(request, response);
		}
		
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-14 上午9:44:02
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void updateCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String cIdStr = request.getParameter("cId");
		int cId = Integer.parseInt(cIdStr);
		String cName = request.getParameter("cName");
		String cAbout = request.getParameter("cAbout");
		int row = categoryService.updateCategory(cName, cAbout, cId);
		if(row>0){
			request.getRequestDispatcher("LoginedCategoryServlet?op=showCategoryList&cRoot=1").forward(request, response);
		}
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-13 下午3:43:13
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */

	private void showCategoryList(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		PageBean pageBean = new PageBean();
		String keyWord = request.getParameter("keyWord");
		try {
			int page = Integer.parseInt(request.getParameter("page"));
			pageBean.setPage(page);
		} catch (NumberFormatException e) {
		}
		String cRootStr= request.getParameter("cRoot");
		int cRoot= Integer.parseInt(cRootStr);
		request.setAttribute("cRoot", cRoot);
		if(keyWord!=null&&!"".equals(keyWord)){
			keyWord=new String(request.getParameter("keyWord").getBytes("ISO-8859-1"), "UTF-8");
			keyWord=new StringBuffer("%").append(keyWord).append("%").toString();
			List<Category> categoryList = categoryService.selectCategoryBykeyWord(cRoot,keyWord, pageBean.getPage(),pageBean.getRows());
			pageBean.setRowsCount(categoryService.getCategoryCountBykeyWord(keyWord,cRoot));
			pageBean.setPagesCount();
			pageBean.setDataList(categoryList);
			request.setAttribute("categoryList", categoryList);
			request.setAttribute("pageBean", pageBean);
		}
		else{
		pageBean.setRowsCount(categoryService.getCountByRoot(cRoot));
		pageBean.setPagesCount();
		List<Category> categoryList = categoryService.selectCategoryByPage(cRoot, pageBean.getPage(),pageBean.getRows());
		pageBean.setDataList(categoryList);
		request.setAttribute("categoryList", categoryList);
		request.setAttribute("pageBean", pageBean);
		
		}
		request.getRequestDispatcher("LoginedCategoryServlet?op=showCategory&cRoot="+cRoot).forward(request, response);
	}

	

	/**
	 *@author linlin
	 *Create Time:2015-1-13 下午2:00:28
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */

	private void toupdateCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String cIdStr = request.getParameter("cId");
		int cId = Integer.parseInt(cIdStr);
		Category cate = categoryService.getCategoryByCateId(cId);
		request.setAttribute("cate", cate);
		List<Category> categorylist = categoryService.getAllCategory();
		request.setAttribute("categorylist", categorylist);
		
		request.getRequestDispatcher("/WEB-INF/page/admin/main/updatecategory.jsp").forward(request, response);
		
		
	}
	

	/**
	 *@author Casper
	 *Create Time:2015-1-13 上午11:12:23
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void toaddnewCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> categorylist = categoryService.getAllCategory();
		request.setAttribute("categorylist", categorylist);
		request.getRequestDispatcher("/WEB-INF/page/admin/main/addnewcategory.jsp").forward(request, response);
		
		
	}


	/**
	 *@author Casper
	 *Create Time:2015-1-13 上午11:00:55
	 *Description: 
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void showCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		List<Category> categorylist = categoryService.getAllCategory();
		request.setAttribute("categorylist", categorylist);
		
//		int cRoot=1;
//		try {
//			cRoot = Integer.parseInt(request.getParameter("cRoot"));
//			if(cRoot<2){
//				cRoot=1;
//			}
//		} catch (Exception e) {
//			
//		}
		int cRoot = Integer.parseInt(request.getParameter("cRoot"));
		List<Category> categoryList = categoryService.getCategoryByRoot(cRoot);
		request.setAttribute("categoryList", categoryList);
		
		request.getRequestDispatcher("/WEB-INF/page/admin/main/showcategoryinfo.jsp").forward(request, response);
	}
}
