/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.entity;

import java.sql.Date;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.entity
 *FileName:Goods.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:14:19
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:商品实体
 *Version
 */
public class Goods {
	
	/**
	 * 商品编号
	 */
	private int gId;
	/**
	 * 类别编号
	 */
	private int gCid;
	/**
	 * 商品名称
	 */
	private String gName;
	/**
	 * 单价
	 */
	private double gMoney;
	/**
	 * 是否允许购买（上架）
	 */
	private boolean gBuy;
	/**
	 * 商品简介
	 */
	private String gBody;
	/**
	 * 上架时间
	 */
	private Date gTime;
	/**
	 * 商品种类，单位：克
	 */
	private int gWeight;
	/**
	 * 商品类别
	 */
	private Category cate;
	
	public int getgCid() {
		return gCid;
	}
	public void setgCid(int gCid) {
		this.gCid = gCid;
	}
	/**
	 * @return the cate
	 */
	public Category getCate() {
		return cate;
	}
	/**
	 * @param cate the cate to set
	 */
	public void setCate(Category cate) {
		this.cate = cate;
	}
	/**
	 * @return the gId
	 */
	public int getgId() {
		return gId;
	}
	/**
	 * @param gId the gId to set
	 */
	public void setgId(int gId) {
		this.gId = gId;
	}
	/**
	 * @return the gName
	 */
	public String getgName() {
		return gName;
	}
	/**
	 * @param gName the gName to set
	 */
	public void setgName(String gName) {
		this.gName = gName;
	}
	/**
	 * @return the gMoney
	 */
	public double getgMoney() {
		return gMoney;
	}
	/**
	 * @param gMoney the gMoney to set
	 */
	public void setgMoney(double gMoney) {
		this.gMoney = gMoney;
	}
	
	/**
	 * @return the gTime
	 */
	public Date getgTime() {
		return gTime;
	}
	/**
	 * @return the gBuy
	 */
	public boolean isgBuy() {
		return gBuy;
	}
	/**
	 * @param gBuy the gBuy to set
	 */
	public void setgBuy(boolean gBuy) {
		this.gBuy = gBuy;
	}
	/**
	 * @return the gBody
	 */
	public String getgBody() {
		return gBody;
	}
	/**
	 * @param gBody the gBody to set
	 */
	public void setgBody(String gBody) {
		this.gBody = gBody;
	}
	/**
	 * @param gTime the gTime to set
	 */
	public void setgTime(Date gTime) {
		this.gTime = gTime;
	}
	/**
	 * @return the gWeight
	 */
	public int getgWeight() {
		return gWeight;
	}
	/**
	 * @param gWeight the gWeight to set
	 */
	public void setgWeight(int gWeight) {
		this.gWeight = gWeight;
	}
	public Goods() {
	}
	
}
