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
 *FileName:Category.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:13:30
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:商品类别实体
 *Version
 */
public class Category {
	/**
	 * 类别编号
	 */
	private int cId;
	/**
	 * 类别名称
	 */
	private String cName;
	/**
	 * 父级编号
	 */
	private int cRoot;
	/**
	 * 类别简介
	 */
	private String cAbout;
	/**
	 * @return the cId
	 */
	public int getcId() {
		return cId;
	}
	/**
	 * @param cId the cId to set
	 */
	public void setcId(int cId) {
		this.cId = cId;
	}
	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}
	/**
	 * @param cName the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}
	/**
	 * @return the cAbout
	 */
	public String getcAbout() {
		return cAbout;
	}
	/**
	 * @param cAbout the cAbout to set
	 */
	public void setcAbout(String cAbout) {
		this.cAbout = cAbout;
	}
	public int getcRoot() {
		return cRoot;
	}
	public void setcRoot(int cRoot) {
		this.cRoot = cRoot;
	}
	/**
	 * 
	 */
	public Category() {
	}
	public Category(int cRoot, String cName, String cAbout) {
		this.cName = cName;
		this.cRoot = cRoot;
		this.cAbout = cAbout;
	}
	
}
