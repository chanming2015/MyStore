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
 *FileName:ZArea.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午11:50:28
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:地区实体
 *Version
 */
public class ZArea {
	/**
	 * 地区代码
	 */
	private String zCode;
	/**
	 * 地区名称
	 */
	private String zName;
	/**
	 * 城市对象
	 */
	private YCity yCity;
	/**
	 * @return the zCode
	 */
	public String getzCode() {
		return zCode;
	}
	/**
	 * @param zCode the zCode to set
	 */
	public void setzCode(String zCode) {
		this.zCode = zCode;
	}
	/**
	 * @return the zName
	 */
	public String getzName() {
		return zName;
	}
	/**
	 * @param zName the zName to set
	 */
	public void setzName(String zName) {
		this.zName = zName;
	}
	/**
	 * @return the yCity
	 */
	public YCity getyCity() {
		return yCity;
	}
	/**
	 * @param yCity the yCity to set
	 */
	public void setyCity(YCity yCity) {
		this.yCity = yCity;
	}
	/**
	 * 
	 */
	public ZArea() {
	}
	
	
}
