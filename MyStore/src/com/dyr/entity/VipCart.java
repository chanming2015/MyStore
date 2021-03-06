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
 *FileName:VipCart.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:29:11
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:用户-购物车映射实体
 *Version
 */
public class VipCart {
	/**
	 * 购物车编号
	 */
	private int vId;
	/**
	 * 用户对象
	 */
	private UserInfo userInfo;
	/**
	 * @return the vId
	 */
	public int getvId() {
		return vId;
	}
	/**
	 * @param vId the vId to set
	 */
	public void setvId(int vId) {
		this.vId = vId;
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
	 * 
	 */
	public VipCart() {
	}
	
	
	
}
