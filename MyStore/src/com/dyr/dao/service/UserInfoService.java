/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.dao.service;

import java.util.List;
import com.dyr.entity.UserInfo;
import com.dyr.util.ServiceUtil;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.dao.service
 *FileName:UserInfoService.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-4 上午9:54:32
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public class UserInfoService{
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:02
	 * Description 用户登录
	 * @param uname
	 * @param upassword
	 * @return
	 */
	public UserInfo login(String uname,String upassword) {
		UserInfo userInfo = ServiceUtil.userInfoDao.userLogin(uname, upassword);
		return userInfo;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:09
	 * Description 用户注册
	 * @param userInfo
	 * @return
	 */
	public int register(UserInfo userInfo){
		int row = ServiceUtil.userInfoDao.register(userInfo);
		ServiceUtil.commit();
		return row;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:13
	 * Description 修改密码
	 * @param upassword
	 * @param uname
	 * @return
	 */
	public int modifyUpdate(String upassword,String uname){
		int row = ServiceUtil.userInfoDao.modifyUpdate(upassword, uname);
		ServiceUtil.commit();
		return row;
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-12 上午10:28:59
	 * Description 管理员登录
	 * @param uname
	 * @param upassword
	 * @return
	 */
	public UserInfo adminLogin(String uname, String upassword) {
		
		UserInfo userInfo = ServiceUtil.userInfoDao.adminLogin(uname, upassword);
		return userInfo;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:17
	 * Description 查询所有管理员
	 * @return
	 */
	public List<UserInfo> showadmin(){
		List<UserInfo> userinfolist =ServiceUtil.userInfoDao.showadmin();
		return userinfolist;
		
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:20
	 * Description 根据用户名查询管理员
	 * @param uName
	 * @return
	 */
	public UserInfo selectUserInfoByuName(String uName){
		UserInfo userInfo = ServiceUtil.userInfoDao.selectAdminByuName(uName);
		return userInfo;
	}
	
	public UserInfo selectUserByuName(String uName){
		UserInfo userInfo = ServiceUtil.userInfoDao.selectUserByuName(uName);
		return userInfo;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:25
	 * Description 分页查询管理员
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<UserInfo> getadminListByPage(int page,int rows){
		return ServiceUtil.userInfoDao.selectUserInfoByPage(page,rows);
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:18:29
	 * Description 查询管理员总数
	 * @return
	 */
	public int getadminCount() {
		return ServiceUtil.userInfoDao.selectadminCount();
	}
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午4:12:28
	 *Description: 模糊查询系统管理员
	 *@param keyWord
	 *@param page
	 *@param rows
	 *@return
	 */
	public List<UserInfo> selectadminListByKeyWord(String keyWord,int page,int rows){
		return ServiceUtil.userInfoDao.selectadminListByKeyWord(keyWord, page, rows);
	}
	
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午4:19:33
	 *Description: 模糊查询用户的数量
	 *@param keyWord
	 *@return
	 */
	public int selectadminCountBykeyWord(String keyWord){
		return ServiceUtil.userInfoDao.selectadminCountByKeyWord(keyWord);
	}
}
