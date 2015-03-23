/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.dyr.entity.ProductCart;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:ProductCartDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:23:44
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface ProductCartDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-19 下午4:17:46
	 * Description 根据购物车编号查询购物车商品集合
	 * @param cartId
	 * @return
	 */
	@Select("select * from ProductCart where PVId =#{cartId}")
	@Results({
		@Result(column="PVId",property="vipCart",one=@One(select="com.dyr.dao.VipCartDao.selectCartByCartId")),
		@Result(column="PGId",property="goods",one=@One(select="com.dyr.dao.GoodsDao.selectGoodsInfoByGoodsId"))
	})
	List<ProductCart> selectProductsListByCartId(int cartId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午2:30:57
	 * Description 将商品添加进购物车
	 * @param cartId
	 * @param goodsId
	 * @param num
	 * @return
	 */
	@Insert("insert into ProductCart values(#{cartId},#{goodsId},#{num})")
	int insertToCart(@Param("cartId")int cartId, @Param("goodsId")int goodsId, @Param("num")int num);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-21 下午6:16:43
	 * Description 删除该购物车中所有商品
	 * @param cartId
	 * @return
	 */
	@Delete("delete from ProductCart where PVId=#{cartId}")
	int deleteAllGoodsFromCartByCartId(int cartId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午9:47:11
	 * Description 根据购物车编号和商品编号查询信息
	 * @param cartId
	 * @param goodsId
	 * @return
	 */
	@Select("select * from ProductCart where PVId =#{cartId} and PGId =#{goodsId}")
	ProductCart selectProductCartByCartIdAndGoodsId(@Param("cartId")int cartId, @Param("goodsId")int goodsId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午9:56:36
	 * Description 修改购物车中商品的数量
	 * @param productCart
	 * @return
	 */
	@Update("update ProductCart set PNum=#{pNum} where PId=#{pId}")
	int updateGoodsCount(ProductCart productCart);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 上午11:37:23
	 * Description 用户从购物车删除商品
	 * @param cartId
	 * @param goodsId
	 * @return
	 */
	@Delete("delete from ProductCart where PVId=#{cartId} and PGId=#{goodsId}")
	int deleteGoodsFromCart(@Param("cartId")int cartId, @Param("goodsId")int goodsId);
	
}
