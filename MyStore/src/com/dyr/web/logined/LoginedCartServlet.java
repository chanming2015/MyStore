package com.dyr.web.logined;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dyr.dao.service.GoodsService;
import com.dyr.dao.service.ImageGoodsService;
import com.dyr.dao.service.ProductCartService;
import com.dyr.dao.service.VipCartService;
import com.dyr.dao.service.XProvinceService;
import com.dyr.dao.service.YCityService;
import com.dyr.dao.service.ZAreaService;
import com.dyr.entity.Goods;
import com.dyr.entity.GoodsIamgeList;
import com.dyr.entity.ImageGoods;
import com.dyr.entity.ProductCart;
import com.dyr.entity.UserInfo;
import com.dyr.entity.XProvince;
import com.dyr.entity.YCity;
import com.dyr.entity.ZArea;

@SuppressWarnings("serial")
public class LoginedCartServlet extends HttpServlet {

	private GoodsService goodsService=new GoodsService();
	private VipCartService vipCartService=new VipCartService();
	private ProductCartService productCartService=new ProductCartService();
	private XProvinceService provinceService=new XProvinceService();
	private YCityService cityService=new YCityService();
	private ZAreaService areaService=new ZAreaService();
	private ImageGoodsService imageGoodsService=new ImageGoodsService();
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String op=request.getParameter("op");
		if("lookcart".equals(op)){
			//用户查看购物车
			lookCart(request,response);
		}else if ("deletegood".equals(op)) {
			//用户从购物车删除商品
			deleteGoodsFromCart(request,response);
		}else if ("addtocart".equals(op)) {
			//用户添加商品到购物车
			addToCart(request,response);
		}else if ("updatecart".equals(op)) {
			//用户修改购物车
			updateCart(request,response);
		}else if ("deletegoods".equals(op)) {
			//用户从购物车删除商品
			deleteGoodsFromCart(request,response);
		}
	}
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-21 下午5:32:59
	 * Description 修改购物车商品信息
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void updateCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//取得用户信息
		if(request.getSession().getAttribute("user")!=null){
			UserInfo u=(UserInfo) request.getSession().getAttribute("user");
			//根据用户名查询购物车ID
			int cartId=vipCartService.getCartIdByUserName(u.getuName());
			ArrayList<Integer> goodsIdArray=new ArrayList<Integer>();
			for (String str : request.getParameterValues("goodsId")) {
				goodsIdArray.add(Integer.parseInt(str));
			}
			
			ArrayList<Integer> goodsNumArray=new ArrayList<Integer>();
			for (String str : request.getParameterValues("num")) {
				goodsNumArray.add(Integer.parseInt(str));
			}
			//删除该用户购物车所有商品
			int rows=productCartService.removeAllGoodsFromCartByCartId(cartId);
			if(rows > 0){
				//添加进购物车
				for (int i = 0; i < goodsIdArray.size(); i++) {
					rows=productCartService.addToCart(cartId,goodsIdArray.get(i),goodsNumArray.get(i));
				}
			}
			//根据购物车ID查询购物车中的商品
			double totalPrice=0;
			List<ProductCart> productList=productCartService.getProductsListByCartId(cartId);
			for (ProductCart productCart : productList) {
				Goods goods=goodsService.getGoodsInfoByGoodsId(productCart.getGoods().getgId());
				productCart.setGoods(goods);
				//计算总价
				totalPrice+=productCart.getpNum()*goods.getgMoney();
			}
			request.setAttribute("totalPrice", totalPrice);
			request.setAttribute("productList", productList);
			//取得省、市、地区的数据
			List<XProvince> provinceList=provinceService.getAllProvince();
			request.setAttribute("provinceList", provinceList);
			List<YCity> cityList=cityService.getAllCity();
			request.setAttribute("cityList", cityList);
			List<ZArea> areaList=areaService.getAllArea();
			request.setAttribute("areaList", areaList);
			request.getRequestDispatcher("/WEB-INF/page/user/main/order.jsp").forward(request, response);
		}
		
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午1:55:27
	 * Description 用户添加商品到购物车
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void addToCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		//取得用户信息
		if(request.getSession().getAttribute("user")!=null){
			UserInfo u=(UserInfo) request.getSession().getAttribute("user");
			//根据用户名查询购物车ID
			int cartId=vipCartService.getCartIdByUserName(u.getuName());
			int goodsId=Integer.parseInt(request.getParameter("goodsId"));
			//查询该用户的购物车中是否有该商品
			ProductCart productCart = productCartService.getProductCartByCartIdAndGoodsId(cartId,goodsId);
			int num=Integer.parseInt(request.getParameter("num"));
			int rows=0;
			if(productCart!=null){
				//修改购物车中商品数量
				productCart.setpNum(productCart.getpNum()+num);
				rows=productCartService.updateGoodsCount(productCart);
			}else {
				//添加进购物车
				rows=productCartService.addToCart(cartId,goodsId,num);
			}
			if(rows==1){
				//添加成功
				Goods goods=goodsService.getGoodsInfoByGoodsId(goodsId);
				List<ImageGoods> imageGoodsList=imageGoodsService.getImageListByGoodsId(goodsId);
				GoodsIamgeList goodsIamge=new GoodsIamgeList(goods);
				//遍历添加图片编号、名称、路径
				for (ImageGoods imageGoods : imageGoodsList) {
					goodsIamge.getImageIdList().add(imageGoods.getImageId());
					goodsIamge.getImageNameList().add(imageGoods.getImageName());
					goodsIamge.getImagePathList().add(imageGoods.getImagePath());
				}
				request.setAttribute("goodsIamge", goodsIamge);
				request.getRequestDispatcher("LoginedCartServlet?op=lookcart").forward(request, response);
			}
		}
		
	}
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-21 上午9:29:17
	 * Description 用户查看购物车
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void lookCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获得用户
		UserInfo u=(UserInfo)request.getSession().getAttribute("user");
		//根据用户名查询购物车ID
		int cartId=vipCartService.getCartIdByUserName(u.getuName());
		//根据购物车ID查询购物车中的商品
		double totalPrice=0;
		List<ProductCart> productList=productCartService.getProductsListByCartId(cartId);
		for (ProductCart productCart : productList) {
			Goods goods=goodsService.getGoodsInfoByGoodsId(productCart.getGoods().getgId());
			/*List<ImageGoods> imageGoodsList=imageGoodsService.getImageListByGoodsId(goods.getgId());
			GoodsIamgeList goodsIamge=new GoodsIamgeList(goods);
			//遍历添加图片编号、名称、路径
			for (ImageGoods imageGoods : imageGoodsList) {
				goodsIamge.getImageIdList().add(imageGoods.getImageId());
				goodsIamge.getImageNameList().add(imageGoods.getImageName());
				goodsIamge.getImagePathList().add(imageGoods.getImagePath());
			}
			request.setAttribute("goodsIamge", goodsIamge);*/
			productCart.setGoods(goods);
			//计算总价
			totalPrice+=productCart.getpNum()*goods.getgMoney();
		}
		request.setAttribute("totalPrice", totalPrice);
		request.setAttribute("productList", productList);
		request.getRequestDispatcher("/WEB-INF/page/user/main/cart.jsp").forward(request, response);
	}


	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-21 上午9:31:19
	 * Description 用户从购物车删除商品
	 * @param request
	 * @param response
	 * @throws IOException 
	 * @throws ServletException 
	 */
	private void deleteGoodsFromCart(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		//获得用户
		UserInfo u=(UserInfo)request.getSession().getAttribute("user");
		//根据用户名查询购物车ID
		int cartId=vipCartService.getCartIdByUserName(u.getuName());
		int goodsId=Integer.parseInt(request.getParameter("goodsId"));
		//删除商品
		int rows = productCartService.deleteGoodsFromCart(cartId,goodsId);
		if(rows > 0){
			lookCart(request, response);
		}
	}

}
