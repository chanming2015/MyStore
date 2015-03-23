/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.web.logined;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dyr.dao.service.DiscussService;
import com.dyr.dao.service.GoodsService;
import com.dyr.entity.Discuss;
import com.dyr.entity.Goods;
import com.dyr.entity.PageBean;
import com.dyr.entity.UserInfo;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.web.logined
 *FileName:LoginedDiscussServlet.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-27 下午1:32:47
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public class LoginedDiscussServlet extends HttpServlet {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String op =  null;
	private DiscussService discussService = new DiscussService();
	private GoodsService goodsService = new GoodsService();
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request,response);
	
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		op = request.getParameter("op");
		if("tocomments".equals(op)){
			tocomments(request,response);
		}else if("comments".equals(op)){
			comments(request,response);
		}
		
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-27 下午2:12:18
	 *Description: 回复评论
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void comments(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		UserInfo userInfo = (UserInfo) request.getSession().getAttribute("user");
		String dBody = request.getParameter("dBody");
		int dLevel =Integer.parseInt(request.getParameter("pj"));
		Discuss discuss = new Discuss();
		discuss.setdGId(goodsId);
		discuss.setdUName(userInfo.getuName());
		discuss.setdBody(dBody);
		discuss.setdLevel(dLevel);
		int row = discussService.addNewdiscuss(discuss);
		if(row>0){
			response.sendRedirect("/MyStore/UserGoodsServlet?op=showinfo&goodsId="+goodsId);
		}
	}


	/**
	 *@author linlin
	 *Create Time:2015-1-27 下午2:05:24
	 *Description: 去回复评论
	 *@param request
	 *@param response    
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void tocomments(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		//根据商品ID查询商品详情
		Goods goods=goodsService.getGoodsInfoByGoodsId(goodsId);
		request.setAttribute("goods", goods);
		request.getRequestDispatcher("/WEB-INF/page/user/main/comments.jsp").forward(request, response);
	}


}
