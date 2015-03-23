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
 *FileName:ProductGoods.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午11:22:38
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:购物车-商品映射实体
 *Version
 */
public class ProductCart {
	/**
	 * 购物车-商品关系表编号
	 */
	private int pId;
	/**
	 * 购买数量
	 */
	private int pNum;
	/**
	 * 购物车对象
	 */
	private VipCart vipCart; 
	/**
	 * 商品对象
	 */
	private Goods goods;
	/**
	 * @return the pId
	 */
	public int getpId() {
		return pId;
	}
	/**
	 * @param pId the pId to set
	 */
	public void setpId(int pId) {
		this.pId = pId;
	}
	/**
	 * @return the pNum
	 */
	public int getpNum() {
		return pNum;
	}
	/**
	 * @param pNum the pNum to set
	 */
	public void setpNum(int pNum) {
		this.pNum = pNum;
	}
	/**
	 * @return the vipCart
	 */
	public VipCart getVipCart() {
		return vipCart;
	}
	/**
	 * @param vipCart the vipCart to set
	 */
	public void setVipCart(VipCart vipCart) {
		this.vipCart = vipCart;
	}
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
	 * 
	 */
	public ProductCart() {
	}
	
	
}
