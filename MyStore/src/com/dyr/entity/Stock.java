/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.entity;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.entity
 *FileName:Stock.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:16:41
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:商品-库存映射实体
 *Version
 */
public class Stock {
	/**
	 * 库存编号
	 */
	private int sId;
	/**
	 * 库存数量
	 */
	private int sNum;
	/**
	 * 商品对象
	 */
	private Goods goods;
	
	/**
	 * @return the goods
	 */
	public Goods getGoods() {
		return goods;
	}
	/**
	 * @param goods the goods to set
	 */
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	/**
	 * @return the sId
	 */
	public int getsId() {
		return sId;
	}
	/**
	 * @param sId the sId to set
	 */
	public void setsId(int sId) {
		this.sId = sId;
	}
	/**
	 * @return the sNum
	 */
	public int getsNum() {
		return sNum;
	}
	/**
	 * @param sNum the sNum to set
	 */
	public void setsNum(int sNum) {
		this.sNum = sNum;
	}
	/**
	 * 
	 */
	public Stock() {
	}
	
}
