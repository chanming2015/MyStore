/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.web.logined;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dyr.dao.service.CategoryService;
import com.dyr.dao.service.GoodsService;
import com.dyr.entity.Category;
import com.dyr.entity.Goods;
import com.dyr.entity.PageBean;

/**
 * Project:MyStore
 * Package:com.dyr.web
 * FileName:ShowGoodsListServlet.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午10:00:21
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
@SuppressWarnings("serial")
public class LoginedAdminGoodsServlet extends HttpServlet {
	
	private GoodsService goodsService=new GoodsService();
	private CategoryService categoryService=new CategoryService();
	private List<Category> categoryList=categoryService.getAllCategory();

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op=request.getParameter("op");
		if("showlist".equals(op)){
			//后台系统根据商品类别ID分页查询商品集合
			adminShowGoodsListByPage(request,response);
		}else if ("showinfo".equals(op)) {
			//根据商品ID查询商品详情
			showGoodsInfo(request,response);
		}else if ("goaddnewgoods".equals(op)) {
			//去到添加新商品页面
			goAddNewGoods(request,response);
		}else if ("addnewgoods".equals(op)) {
			//新增商品操作
			addNewGoods(request,response);
		}else if ("updategoodsinfo".equals(op)) {
			//修改商品信息操作
			updateGoodsInfo(request,response);
		}else if ("goupdategoodsinfo".equals(op)) {
			//去到修改商品信息页面
			goUpdateGoodsInfo(request,response);
		}else if ("deletegoods".equals(op)) {
			//下架商品
			deleteGoods(request,response);
		}else if ("salesgoods".equals(op)) {
			//上架商品
			salesGoods(request,response);
		}
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-19 下午4:42:32
	 * Description
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void salesGoods(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//获取需要下架的商品编号
			int goodsId=Integer.parseInt(request.getParameter("goodsId"));
			// 下架商品
			int rows=goodsService.salesGoods(goodsId);
			if(rows==1){
				//修改成功
				request.getRequestDispatcher("/WEB-INF/page/admin/main.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-19 下午4:07:18
	 * Description 下架商品
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void deleteGoods(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		try {
			//获取需要下架的商品编号
			int goodsId=Integer.parseInt(request.getParameter("goodsId"));
			// 下架商品
			int rows=goodsService.deleteGoods(goodsId);
			if(rows==1){
				//修改成功
				request.getRequestDispatcher("/WEB-INF/page/admin/main.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 上午11:25:45
	 * Description 后台系统根据商品类别ID分页查询商品集合
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void adminShowGoodsListByPage(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PageBean pageBean=new PageBean();
		//获取商品类别ID,默认显示外套,10为外套类别
		int root=1;
		int cateId=10;
		String keyWord=request.getParameter("keyword");
		try {
			cateId=Integer.parseInt(request.getParameter("smallCate"));
			if(cateId>0){
				root=categoryService.getRootByCateId(cateId);
			}else {
				root=0;
			}
			int page=Integer.parseInt(request.getParameter("page"));
			pageBean.setPage(page);
		} catch (NumberFormatException e) {
		}
		//模糊查询商品
		//取得关键字
		if(keyWord!=null&&!"".equals(keyWord)){
			keyWord=new String(request.getParameter("keyword").getBytes("ISO-8859-1"), "UTF-8");
			keyWord=new StringBuffer("%").append(keyWord).append("%").toString();
			List<Goods> goodsList=goodsService.getAllGoodsListByKeyWord(keyWord,pageBean.getPage(),pageBean.getRows());
			int rowsCount=goodsService.getGoodsCountByKeyWord(keyWord);
			//将需要显示的数据放入pageBean
			setPageBean(rowsCount,goodsList,pageBean);
			request.setAttribute("root", 0);
			request.setAttribute("smallCate", 0);
			request.setAttribute("keyWord", keyWord);
		}else {
			int rowsCount=goodsService.getGoodsAllCountByCateId(cateId);
			//根据商品类别ID查询商品集合
			List<Goods> goodsList=goodsService.getAllGoodsListByCateId(cateId,pageBean.getPage(),pageBean.getRows());
			//将需要显示的数据放入pageBean
			setPageBean(rowsCount,goodsList,pageBean);
			request.setAttribute("root", root);
			request.setAttribute("smallCate", cateId);
		}
		request.setAttribute("pageBean", pageBean);
		request.setAttribute("categoryList", categoryList);
		request.getRequestDispatcher("/WEB-INF/page/admin/main/showgoodslist.jsp").forward(request, response);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午3:30:19
	 * Description
	 * @param rowsCount
	 * @param goodsList
	 */
	private void setPageBean(int rowsCount, List<Goods> goodsList,PageBean pageBean) {
		
		pageBean.setRowsCount(rowsCount);
		pageBean.setPagesCount();
		pageBean.setDataList(goodsList);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-14 下午4:08:56
	 * Description 修改商品信息操作
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void updateGoodsInfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		Goods goods=new Goods();
		try {
			//获取需要修改的商品编号
			int goodsId=Integer.parseInt(request.getParameter("goodsId"));
			//取得商品名称
			String goodsName=request.getParameter("goodsName");
			//取得商品类别ＩＤ
			int cateId=Integer.parseInt(request.getParameter("smallCate"));
			//取得商品价格
			double price=Double.parseDouble(request.getParameter("price"));
			//取得商品是否允许购买
			Boolean buy=request.getParameter("buy").equals("允许")? true : false;
			//取得商品净重
			int weight=Integer.parseInt(request.getParameter("weight"));
			//取得商品信息
			String goodsInfo=request.getParameter("goodsInfo");
			
			goods.setgId(goodsId);
			goods.setgName(goodsName);
			goods.setgCid(cateId);
			goods.setgMoney(price);
			goods.setgBuy(buy);
			goods.setgWeight(weight);
			goods.setgBody(goodsInfo);
			int rows=goodsService.updateGoodsInfo(goods);
			if(rows==1){
				//修改成功
				request.getRequestDispatcher("/WEB-INF/page/admin/main.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-13 下午6:59:29
	 * Description 去到修改商品信息页面
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void goUpdateGoodsInfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获取要修改的商品的ID
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		//得到商品信息
		Goods goods=goodsService.getGoodsInfoByGoodsId(goodsId);
		request.setAttribute("goods", goods);
		//根据商品类别ID查询父级ID
		int root=categoryService.getRootByCateId(goods.getCate().getcId());
		request.setAttribute("root", root);
		request.setAttribute("categoryList", categoryList);		
		request.setAttribute("goodsId", goodsId);
		request.getRequestDispatcher("/WEB-INF/page/admin/main/updategoodsinfo.jsp").forward(request, response);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-12 下午6:57:46
	 * Description 去到添加新商品页面
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void goAddNewGoods(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("categoryList", categoryList);
		request.getRequestDispatcher("/WEB-INF/page/admin/main/addnewgoods.jsp").forward(request, response);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午10:36:18
	 * Description 新增商品操作
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void addNewGoods(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		Goods goods=new Goods();
		try {
			//获取最大商品编号加1
			int maxNum=goodsService.getGoodsMaxNum() + 1;
			//取得商品名称
			String goodsName=request.getParameter("goodsName");
			//取得商品类别ＩＤ
			int cateId=Integer.parseInt(request.getParameter("smallCate"));
			//取得商品价格
			double price=Double.parseDouble(request.getParameter("price"));
			//取得商品是否允许购买
			Boolean buy=request.getParameter("buy").equals("允许")? true : false;
			//取得商品净重
			int weight=Integer.parseInt(request.getParameter("weight"));
			//取得商品信息
			String goodsInfo=request.getParameter("goodsInfo");
			
			goods.setgId(maxNum);
			goods.setgName(goodsName);
			goods.setgCid(cateId);
			goods.setgMoney(price);
			goods.setgBuy(buy);
			goods.setgWeight(weight);
			goods.setgBody(goodsInfo);
			int rows=goodsService.addNewGoods(goods);
			if(rows==1){
				//添加成功
				request.setAttribute("goodsNum",maxNum );
				request.getRequestDispatcher("/WEB-INF/page/admin/main/goodsimages.jsp").forward(request, response);
			}
		} catch (NumberFormatException e) {
		}
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午10:14:47
	 * Description 根据商品ID查询商品详情
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void showGoodsInfo(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			//获取商品ID
			int goodsId=Integer.parseInt(request.getParameter("goodsId"));
			//根据商品ID查询商品详情
			Goods goods=goodsService.getGoodsInfoByGoodsId(goodsId);
			request.setAttribute("goods", goods);
			request.getRequestDispatcher("#").forward(request, response);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}
