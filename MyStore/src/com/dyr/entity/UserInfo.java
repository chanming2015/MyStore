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
 *FileName:UserInfo.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2014-12-31 上午10:09:03
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Description:用户实体
 *Version
 */
public class UserInfo {
	/**
	 * 用户名
	 */
	private String uName;
	/**
	 * 密码
	 */
	private String uPassword;
	/**
	 * 性别
	 */
	private String uSex;
	/**
	 * 邮箱
	 */
	private String uEmail;
	/**
	 * 密保问题
	 */
	private String uSafeQuestion;
	/**
	 * 密保答案
	 */
	private String uSafeAnswer;
	/**
	 * 真实姓名
	 */
	private String uRealName;
	/**
	 * 身份证
	 */
	private String uIdCard;
	/**
	 * 权限
	 */
	private int uPermission;
	/**
	 * @return the uName
	 */
	public String getuName() {
		return uName;
	}
	/**
	 * @param uName the uName to set
	 */
	public void setuName(String uName) {
		this.uName = uName;
	}
	/**
	 * @return the uPassword
	 */
	public String getuPassword() {
		return uPassword;
	}
	/**
	 * @param uPassword the uPassword to set
	 */
	public void setuPassword(String uPassword) {
		this.uPassword = uPassword;
	}
	/**
	 * @return the uSex
	 */
	public String getuSex() {
		return uSex;
	}
	/**
	 * @param uSex the uSex to set
	 */
	public void setuSex(String uSex) {
		this.uSex = uSex;
	}
	/**
	 * @return the uEmail
	 */
	public String getuEmail() {
		return uEmail;
	}
	/**
	 * @param uEmail the uEmail to set
	 */
	public void setuEmail(String uEmail) {
		this.uEmail = uEmail;
	}
	/**
	 * @return the uSafeQuestion
	 */
	public String getuSafeQuestion() {
		return uSafeQuestion;
	}
	/**
	 * @param uSafeQuestion the uSafeQuestion to set
	 */
	public void setuSafeQuestion(String uSafeQuestion) {
		this.uSafeQuestion = uSafeQuestion;
	}
	/**
	 * @return the uSafeAnswer
	 */
	public String getuSafeAnswer() {
		return uSafeAnswer;
	}
	/**
	 * @param uSafeAnswer the uSafeAnswer to set
	 */
	public void setuSafeAnswer(String uSafeAnswer) {
		this.uSafeAnswer = uSafeAnswer;
	}
	/**
	 * @return the uRealName
	 */
	public String getuRealName() {
		return uRealName;
	}
	/**
	 * @param uRealName the uRealName to set
	 */
	public void setuRealName(String uRealName) {
		this.uRealName = uRealName;
	}
	/**
	 * @return the uIdCard
	 */
	public String getuIdCard() {
		return uIdCard;
	}
	/**
	 * @param uIdCard the uIdCard to set
	 */
	public void setuIdCard(String uIdCard) {
		this.uIdCard = uIdCard;
	}
	/**
	 * @return the uPermission
	 */
	public int getuPermission() {
		return uPermission;
	}
	/**
	 * @param uPermission the uPermission to set
	 */
	public void setuPermission(int uPermission) {
		this.uPermission = uPermission;
	}
	/**
	 * 
	 */
	public UserInfo() {
	}
	/**
	 * @param uName
	 * @param uPassword
	 * @param uSex
	 * @param uEmail
	 * @param uSafeQuestion
	 * @param uSafeAnswer
	 * @param uRealName
	 * @param uIdCard
	 * @param uPermission
	 */
	public UserInfo(String uName, String uPassword, String uSex, String uEmail,
			String uSafeQuestion, String uSafeAnswer, String uRealName,
			String uIdCard, int uPermission) {
		this.uName = uName;
		this.uPassword = uPassword;
		this.uSex = uSex;
		this.uEmail = uEmail;
		this.uSafeQuestion = uSafeQuestion;
		this.uSafeAnswer = uSafeAnswer;
		this.uRealName = uRealName;
		this.uIdCard = uIdCard;
		this.uPermission = uPermission;
	}
}
