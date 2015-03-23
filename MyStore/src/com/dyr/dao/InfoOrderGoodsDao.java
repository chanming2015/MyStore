/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import com.dyr.entity.InfoOrderGoods;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:InfoOrderGoodsDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:23:29
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface InfoOrderGoodsDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午5:53:43
	 * Description 根据订单编号查询订单详情集合
	 * @param orderId
	 * @return
	 */
	@Select("select * from InfoOrderGoods where IOId=#{orderId}")
	@Results({
		@Result(column="IOId",property="orderUser",one=@One(select="com.dyr.dao.OrderUserDao.selectOrderByOrderId")),
		@Result(column="IGId",property="goods",one=@One(select="com.dyr.dao.GoodsDao.selectGoodsInfoByGoodsId"))
	})
	List<InfoOrderGoods> selectOrderInfoListByOrderId(int orderId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午4:44:39
	 * Description 向订单详情表插入数据
	 * @param orderId
	 * @param goodsId
	 * @param num
	 * @return
	 */
	@Insert("insert into InfoOrderGoods values(#{orderId},#{goodsId},#{num})")
	int insertInfo(@Param("orderId")int orderId, @Param("goodsId")int goodsId, @Param("num")int num);
	
}
