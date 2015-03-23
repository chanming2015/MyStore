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
 *FileName:Discuss.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:17:22
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:商品评论实体
 *Version
 */
public class Discuss {
	/**
	 * 留言id
	 */
	private int dId;
	/**
	 * 留言内容
	 */
	private int dGId;
	private String dUName;
	private String dBody;
	/**
	 * 留言时间
	 */
	private Date dTime;
	/**
	 * 1差评，2中评，3好评
	 */
	private int dLevel;
	/**
	 * 0未审核，1已审核
	 */
	private int dSh;
	/**
	 * 商品对象
	 */
	private Goods goods;
	/**
	 * 用户对象
	 */
	private UserInfo userInfo;
	
	
	/**
	 * @return the dId
	 */
	public int getdId() {
		return dId;
	}


	/**
	 * @param dId the dId to set
	 */
	public void setdId(int dId) {
		this.dId = dId;
	}


	/**
	 * @return the dBody
	 */
	public String getdBody() {
		return dBody;
	}


	/**
	 * @param dBody the dBody to set
	 */
	public void setdBody(String dBody) {
		this.dBody = dBody;
	}


	/**
	 * @return the dTime
	 */
	public Date getdTime() {
		return dTime;
	}


	/**
	 * @param dTime the dTime to set
	 */
	public void setdTime(Date dTime) {
		this.dTime = dTime;
	}


	/**
	 * @return the dLevel
	 */
	public int getdLevel() {
		return dLevel;
	}


	/**
	 * @param dLevel the dLevel to set
	 */
	public void setdLevel(int dLevel) {
		this.dLevel = dLevel;
	}


	/**
	 * @return the dSh
	 */
	public int getdSh() {
		return dSh;
	}


	/**
	 * @param dSh the dSh to set
	 */
	public void setdSh(int dSh) {
		this.dSh = dSh;
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
	 * @return the userInfo
	 */
	public UserInfo getUserInfo() {
		return userInfo;
	}


	/**
	 * @param userInfo the userInfo to set
	 */
	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}


	/**
	 * @return the dGId
	 */
	public int getdGId() {
		return dGId;
	}


	/**
	 * @param dGId the dGId to set
	 */
	public void setdGId(int dGId) {
		this.dGId = dGId;
	}


	/**
	 * @return the dUName
	 */
	public String getdUName() {
		return dUName;
	}


	/**
	 * @param dUName the dUName to set
	 */
	public void setdUName(String dUName) {
		this.dUName = dUName;
	}


	public Discuss() {
	}
	
}
