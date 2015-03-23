/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import com.dyr.entity.UserInfo;


/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.dao
 *FileName:UserInfoDao.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-4 上午9:46:55
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public interface UserInfoDao {
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:26:26
	 * Description 用户登录
	 * @param UName
	 * @param UPassword
	 * @return
	 */
	@Select("select * from userinfo where UName=#{uname} and UPassword=#{upassword} and UPermission=2")
	UserInfo userLogin(@Param("uname") String UName , @Param("upassword") String UPassword);
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:26:31
	 * Description 用户注册
	 * @param userInfo
	 * @return
	 */
	@Insert("insert into userinfo values(#{uName},#{uPassword},#{uSex},#{uEmail},#{uSafeQuestion},#{uSafeAnswer},#{uRealName},#{uIdCard},#{uPermission})")
	int register(UserInfo userInfo);
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:26:36
	 * Description 修改密码
	 * @param UPassword
	 * @param UName
	 * @return
	 */
	@Update("update userinfo set UPassword=#{uPassword} where UName=#{uName}")
	int modifyUpdate(@Param("uPassword") String UPassword,@Param("uName") String UName);
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-12 上午10:29:27
	 * Description 管理员登录
	 * @param uname
	 * @param upassword
	 * @return
	 */
	@Select("select * from userinfo where UName=#{uname} and UPassword=#{upassword} and UPermission=1")
	UserInfo adminLogin(@Param("uname") String UName , @Param("upassword") String UPassword);
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:26:46
	 * Description 查询所有管理员
	 * @return
	 */
	@Select("select * from userinfo where uPermission=1")
	List<UserInfo> showadmin();
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:26:53
	 * Description 根据用户名查询管理员
	 * @param uName
	 * @return
	 */
	@Select("select * from userinfo where uName=#{uName} and UPermission=1")
	UserInfo selectAdminByuName(@Param("uName") String uName);
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午4:29:25
	 * Description 根据用户名查询用户
	 * @param uName
	 * @return
	 */
	@Select("select * from userinfo where uName=#{uName} and UPermission=2")
	UserInfo selectUserByuName(String uName);
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:19:49
	 * Description 分页查询管理员
	 * @param page
	 * @param rows
	 * @return
	 */
	@Select("select top (#{rows}) * from UserInfo where UName not in (select top ((#{page}-1)*#{rows}) UName from UserInfo where uPermission=1) and uPermission=1")
	List<UserInfo> selectUserInfoByPage(@Param("page") int page,@Param("rows")int rows);
	
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午4:09:26
	 *Description: 模糊查询管理员
	 *@param keyWord
	 *@param page
	 *@param rows
	 *@return
	 */
	@Select("select top (#{rows}) * from UserInfo where UName not in (select top ((#{page}-1)*#{rows}) UName from UserInfo where uPermission=1 and uName like #{keyWord}) and uPermission=1 and uName like #{keyWord}")
	List<UserInfo> selectadminListByKeyWord(@Param("keyWord")String keyWord, @Param("page")int page, @Param("rows")int rows);
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午6:19:53
	 * Description 查询管理员总数
	 * @return
	 */
	@Select("select COUNT(UName) from UserInfo where UPermission=1")
	int selectadminCount();
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午4:18:05
	 *Description: 模糊查询的用户数量
	 *@param keyWord
	 *@return
	 */
	@Select("select COUNT(*) from UserInfo where uName like #{keyWord} and UPermission=1")
	int selectadminCountByKeyWord(String keyWord);
}
