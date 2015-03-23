/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.dyr.entity.VipCart;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:VipCartDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:24:01
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface VipCartDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午3:25:10
	 * Description 根据用户名查询购物车编号
	 * @param userName
	 * @return 
	 */
	@Select("select VId from VipCart where VUName=#{userName}")
	int selectCartIdByUserName(String userName);
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-21 下午4:44:38
	 * Description 根据订单ID查询订单对象
	 * @param cartId
	 * @return
	 */
	@Select("select * from VipCart where VId=#{cartId}")
	VipCart selectCartByCartId(int cartId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午6:25:29
	 * Description 给用户分配购物车
	 * @param uname
	 * @return
	 */
	@Insert("insert into VipCart values(#{uname})")
	int userGetCart(String uname);
}
