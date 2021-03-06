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
 *FileName:YCity.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午11:48:09
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:城市实体
 *Version
 */
public class YCity {
	/**
	 * 城市代码
	 */
	private String yCode;
	/**
	 * 城市名称
	 */
	private String yName;
	/**
	 * 省对象
	 */
	private XProvince xProvince;
	/**
	 * @return the yCode
	 */
	public String getyCode() {
		return yCode;
	}
	/**
	 * @param yCode the yCode to set
	 */
	public void setyCode(String yCode) {
		this.yCode = yCode;
	}
	/**
	 * @return the yName
	 */
	public String getyName() {
		return yName;
	}
	/**
	 * @param yName the yName to set
	 */
	public void setyName(String yName) {
		this.yName = yName;
	}
	/**
	 * @return the xProvince
	 */
	public XProvince getxProvince() {
		return xProvince;
	}
	/**
	 * @param xProvince the xProvince to set
	 */
	public void setxProvince(XProvince xProvince) {
		this.xProvince = xProvince;
	}
	/**
	 * 
	 */
	public YCity() {
	}
	
	
}
