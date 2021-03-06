/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.dyr.entity.Stock;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:StockDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:23:52
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface StockDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-14 上午11:14:55
	 * Description 根据商品编号查询库存对象
	 * @param goodsId
	 * @return
	 */
	@Select("select * from Stock where SGId=#{goodsId}")
	@Results({
		@Result(column="SGId",property="goods",one=@One(select="com.dyr.dao.GoodsDao.selectGoodsInfoByGoodsId"))
	})
	Stock selectStockByGoodsId(int goodsId);

}
