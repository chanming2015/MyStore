/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.entity;

/**
 * Project:MyStore
 * Package:com.dyr.entity
 * FileName:AttributeCategory.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-23 下午3:28:30
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Description:类别-属性映射实体
 * Version:
 */
public class AttributeCategory {

	/**
	 * 属性ID
	 */
	private int aId;
	/**
	 * 类别ID
	 */
	private Category cate;
	/**
	 * 属性名
	 */
	private String aName;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public Category getCate() {
		return cate;
	}
	public void setCate(Category cate) {
		this.cate = cate;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
}
