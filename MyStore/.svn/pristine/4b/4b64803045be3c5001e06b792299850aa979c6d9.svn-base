/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.InfoOrderGoods;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:InfoOrderGoodsService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午5:00:25
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class InfoOrderGoodsService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午5:51:52
	 * Description 根据订单编号查询订单详情集合
	 * @param orderId
	 * @return
	 */
	public List<InfoOrderGoods> getOrderInfoListByOrderId(int orderId) {
		
		return ServiceUtil.infoOrderGoodsDao.selectOrderInfoListByOrderId(orderId);
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午4:42:52
	 * Description 向订单详情表插入数据
	 * @param maxId
	 * @param getgId
	 * @param getpNum
	 */
	public int addInfo(int orderId, int goodsId, int num) {
		
		int rows=ServiceUtil.infoOrderGoodsDao.insertInfo(orderId,goodsId,num);
		ServiceUtil.commit();
		return rows;
	}

}
