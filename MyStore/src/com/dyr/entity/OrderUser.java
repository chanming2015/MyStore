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
 *FileName:OrderUser.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午11:26:35
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:订单-用户映射实体
 *Version
 */
public class OrderUser {
	/**
	 * 用户-订单关系表编号
	 */
	private int oId;
	/**
	 * 总价
	 */
	private double oPrice;
	/**
	 * 联系方式
	 */
	private String oPhone;
	/**
	 * 省
	 */
	private XProvince oProvince;
	private String province;
	/**
	 * 市
	 */
	private YCity oCity;
	private String city;
	/**
	 * 地区
	 */
	private ZArea oArea;
	private String area;
	/**
	 * 详细地址
	 */
	private String oAddress;
	/**
	 * 邮箱
	 */
	private String oPostcode;
	/**
	 * 订单状态
	 */
	private String oState;
	/**
	 * 用户表
	 */
	private UserInfo userInfo;
	private String userName;
	
	
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public XProvince getoProvince() {
		return oProvince;
	}
	public void setoProvince(XProvince oProvince) {
		this.oProvince = oProvince;
	}
	public YCity getoCity() {
		return oCity;
	}
	public void setoCity(YCity oCity) {
		this.oCity = oCity;
	}
	public ZArea getoArea() {
		return oArea;
	}
	public void setoArea(ZArea oArea) {
		this.oArea = oArea;
	}
	/**
	 * @return the oId
	 */
	public int getoId() {
		return oId;
	}
	/**
	 * @param oId the oId to set
	 */
	public void setoId(int oId) {
		this.oId = oId;
	}
	/**
	 * @return the oPrice
	 */
	public double getoPrice() {
		return oPrice;
	}
	/**
	 * @param oPrice the oPrice to set
	 */
	public void setoPrice(double oPrice) {
		this.oPrice = oPrice;
	}
	/**
	 * @return the oPhone
	 */
	public String getoPhone() {
		return oPhone;
	}
	/**
	 * @param oPhone the oPhone to set
	 */
	public void setoPhone(String oPhone) {
		this.oPhone = oPhone;
	}
	/**
	 * @return the oAddress
	 */
	public String getoAddress() {
		return oAddress;
	}
	/**
	 * @param oAddress the oAddress to set
	 */
	public void setoAddress(String oAddress) {
		this.oAddress = oAddress;
	}
	/**
	 * @return the oPostcode
	 */
	public String getoPostcode() {
		return oPostcode;
	}
	/**
	 * @param oPostcode the oPostcode to set
	 */
	public void setoPostcode(String oPostcode) {
		this.oPostcode = oPostcode;
	}
	/**
	 * @return the oState
	 */
	public String getoState() {
		return oState;
	}
	/**
	 * @param oState the oState to set
	 */
	public void setoState(String oState) {
		this.oState = oState;
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
	public OrderUser() {
	}
}
