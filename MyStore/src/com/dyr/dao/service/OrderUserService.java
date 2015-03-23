/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;
import com.dyr.entity.OrderUser;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:OrderUserService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午5:00:41
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class OrderUserService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午4:17:29
	 * Description 根据用户名查询该用户的所有订单
	 * @param getuName
	 * @return
	 */
	public List<OrderUser> getOrderListByUserName(String userName) {
		
		return ServiceUtil.orderUserDao.selectOrderListByUserName(userName);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午3:45:41
	 * Description 用户添加订单
	 * @param orderUser
	 * @return
	 */
	public int addNewOrder(OrderUser orderUser) {
		
		int rows=ServiceUtil.orderUserDao.insertNewOrder(orderUser);
		ServiceUtil.commit();
		return rows;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午4:37:57
	 * Description 获取最大订单ID
	 * @return
	 */
	public int getMaxId() {
		
		return ServiceUtil.orderUserDao.selectMaxId();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-23 下午2:10:19
	 * Description
	 * @param userName
	 * @param state
	 * @return
	 */
	public List<OrderUser> getOrderListByUserNameAndState(int page,String userName,	String state) {
		
		return ServiceUtil.orderUserDao.selectOrderDetailsByNameAndState(page,userName, state);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-23 下午4:10:36
	 * Description 根据用户名和订单状态查询订单总数
	 * @param getuName
	 * @param string
	 * @return
	 */
	public int getOrderCountByUserNameAndState(String uName, String state) {
		
		return ServiceUtil.orderUserDao.selectOrderCountByUserNameAndState(uName,state);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午1:19:56
	 * Description 分页查询订单
	 * @param rows 
	 * @param page 
	 * @return
	 */
	public List<OrderUser> getOrdersByPage(int page, int rows) {
		
		return ServiceUtil.orderUserDao.selectAllOrder(page,rows);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午1:29:02
	 * Description 查询所有订单总数
	 * @return
	 */
	public int getOrderCount() {
		
		return ServiceUtil.orderUserDao.selectOrderCount();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午1:55:58
	 * Description 根据订单编号查询订单
	 * @param orderId
	 * @return
	 */
	public OrderUser getOrderByOrderId(int orderId) {
		
		return ServiceUtil.orderUserDao.selectOrderByOrderId(orderId);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午2:38:02
	 * Description 按关键字模糊查询订单
	 * @param keyword
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<OrderUser> getOrderListByKeyWord(String keyword, int page, int rows) {
		
		return ServiceUtil.orderUserDao.selectOrderListByKeyWord(keyword,page,rows);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午2:48:47
	 * Description 按关键字模糊查询订单总数 
	 * @param keyword
	 * @return
	 */
	public int getOrderCountByKeyWord(String keyword) {
		
		return ServiceUtil.orderUserDao.selectOrderCountByKeyWord(keyword);
	}

}
