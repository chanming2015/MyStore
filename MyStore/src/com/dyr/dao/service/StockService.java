/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import com.dyr.entity.Stock;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:StockService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午5:01:16
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class StockService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-14 上午11:05:19
	 * Description 根据商品编号查询库存对象
	 * @param getgId
	 * @return
	 */
	public Stock getStockByGoodsId(int goodsId) {
		
		return ServiceUtil.stockDao.selectStockByGoodsId(goodsId);
	}
}
