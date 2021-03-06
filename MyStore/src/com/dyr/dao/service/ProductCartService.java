/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.ProductCart;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:ProductCartService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午5:00:56
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class ProductCartService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-19 下午4:17:18
	 * Description 根据购物车编号查询购物车商品集合
	 * @param cartId 
	 * @return
	 */
	public List<ProductCart> getProductsListByCartId(int cartId) {
		
		return ServiceUtil.productCartDao.selectProductsListByCartId(cartId);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午2:30:10
	 * Description 将商品添加进购物车
	 * @param cartId
	 * @param goodsId
	 * @param num
	 * @return
	 */
	public int addToCart(int cartId, int goodsId, int num) {
		
		int row = ServiceUtil.productCartDao.insertToCart(cartId,goodsId,num);
		ServiceUtil.commit();
		return row;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-21 下午6:01:36
	 * Description 移除该用户购物车所有商品
	 * @param cartId
	 * @return
	 */
	public int removeAllGoodsFromCartByCartId(int cartId) {
		
		int row = ServiceUtil.productCartDao.deleteAllGoodsFromCartByCartId(cartId);
		ServiceUtil.commit();
		return row;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午9:43:39
	 * Description 根据购物车编号和商品编号查询信息
	 * @param cartId
	 * @param goodsId
	 */
	public ProductCart getProductCartByCartIdAndGoodsId(int cartId, int goodsId) {
		
		return ServiceUtil.productCartDao.selectProductCartByCartIdAndGoodsId(cartId,goodsId);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午9:56:07
	 * Description 修改购物车中商品的数量
	 * @param productCart
	 * @return
	 */
	public int updateGoodsCount(ProductCart productCart) {
		
		return ServiceUtil.productCartDao.updateGoodsCount(productCart);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午11:36:49
	 * Description 用户从购物车删除商品
	 * @param cartId
	 * @param goodsId
	 * @return
	 */
	public int deleteGoodsFromCart(int cartId, int goodsId) {
		
		int row = ServiceUtil.productCartDao.deleteGoodsFromCart(cartId, goodsId);
		ServiceUtil.commit();
		return row;
	}
}
