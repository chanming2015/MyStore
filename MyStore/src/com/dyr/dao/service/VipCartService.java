/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:VipCartService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午5:01:33
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class VipCartService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午3:23:50
	 * Description 根据用户名查询购物车编号
	 * @param getuName
	 */
	public int getCartIdByUserName(String userName) {
		
		return ServiceUtil.vipCartDao.selectCartIdByUserName(userName);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午6:24:36
	 * Description 给用户分配购物车
	 * @param uname
	 * @return
	 */
	public int userGetCart(String uname) {
		
		int rows=ServiceUtil.vipCartDao.userGetCart(uname);
		ServiceUtil.commit();
		return rows;
	}

	
}
