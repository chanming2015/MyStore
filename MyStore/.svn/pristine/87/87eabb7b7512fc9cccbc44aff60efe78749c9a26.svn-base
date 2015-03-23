/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.dyr.entity.OrderUser;


/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:OrderUserDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:23:37
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface OrderUserDao {
	
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午4:11:20
	 * Description 根据用户名和订单状态查询订单
	 * @param userName
	 * @return
	 */
	//select * from orderuser where ouname=#{oUname} and OState=#{oState}
	@Select("select top 10 * from orderuser where ouname=#{oUname} and OState=#{oState} and OId not in( select top ((#{page}-1)*10) OId from orderuser where ouname=#{oUname} and OState=#{oState})")
	@Results({
		@Result(column="OUName",property="userInfo",one=@One(select="com.dyr.dao.UserInfoDao.selectUserByuName")),
		@Result(column="OProvince",property="oProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode")),
		@Result(column="OCity",property="oCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode")),
		@Result(column="OArea",property="oArea",one=@One(select="com.dyr.dao.ZAreaDao.selectAreaByAreaCode"))
	})
	public List<OrderUser> selectOrderDetailsByNameAndState(@Param("page")int page,@Param("oUname")String oUname ,@Param("oState") String oState);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午4:19:21
	 * Description 根据用户名查询订单
	 * @param userName
	 * @return
	 */
	@Select("select * from OrderUser where OUName=#{userName}")
	@Results({
		@Result(column="OUName",property="userInfo",one=@One(select="com.dyr.dao.UserInfoDao.selectUserByuName")),
		@Result(column="OProvince",property="oProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode")),
		@Result(column="OCity",property="oCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode")),
		@Result(column="OArea",property="oArea",one=@One(select="com.dyr.dao.ZAreaDao.selectAreaByAreaCode"))
	})
	public List<OrderUser> selectOrderListByUserName(String userName);
	
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-15 下午4:19:21
	 * Description 根据订单编号查询订单
	 * @param userName
	 * @return
	 */
	@Select("select * from OrderUser where OId=#{orderId}")
	@Results({
		@Result(column="OUName",property="userInfo",one=@One(select="com.dyr.dao.UserInfoDao.selectUserByuName")),
		@Result(column="OProvince",property="oProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode")),
		@Result(column="OCity",property="oCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode")),
		@Result(column="OArea",property="oArea",one=@One(select="com.dyr.dao.ZAreaDao.selectAreaByAreaCode"))
	})
	public OrderUser selectOrderByOrderId(int orderId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午3:46:10
	 * Description 用户添加订单
	 * @param orderUser
	 * @return
	 */
	@Insert("insert into OrderUser values(#{oId},#{userName},#{oPrice},#{oPhone},#{province},#{city},#{area},#{oAddress},'50000','待付款')")
	public int insertNewOrder(OrderUser orderUser);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午4:38:36
	 * Description 获取最大订单ID
	 * @return
	 */
	@Select("select MAX(OId) from OrderUser")
	public int selectMaxId();

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-23 下午4:11:51
	 * Description 根据用户名和订单状态查询订单总数
	 * @param uName
	 * @param state
	 * @return
	 */
	@Select("select COUNT(OId) from orderuser where ouname=#{oUname} and OState=#{oState}")
	public int selectOrderCountByUserNameAndState(@Param("oUname")String oUname ,@Param("oState") String oState);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午1:20:24
	 * Description 分页查询订单
	 * @param rows 
	 * @param page 
	 * @return
	 */
	@Select("select top (#{rows}) * from orderuser where OId not in (select top ((#{page}-1)*#{rows}) OId from orderuser)")
	@Results({
		@Result(column="OUName",property="userInfo",one=@One(select="com.dyr.dao.UserInfoDao.selectUserByuName")),
		@Result(column="OProvince",property="oProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode")),
		@Result(column="OCity",property="oCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode")),
		@Result(column="OArea",property="oArea",one=@One(select="com.dyr.dao.ZAreaDao.selectAreaByAreaCode"))
	})
	public List<OrderUser> selectAllOrder(@Param("page")int page, @Param("rows")int rows);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午1:30:04
	 * Description 查询所有订单总数
	 * @return
	 */
	@Select("select COUNT(OId) from orderuser")
	public int selectOrderCount();

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午2:41:25
	 * Description 按关键字模糊查询订单
	 * @param keyword
	 * @param page
	 * @param rows
	 * @return
	 */
	@Select("select top (#{rows}) * from orderuser where OId not in (select top ((#{page}-1)*#{rows}) OId from orderuser where OUName like #{keyword}) and OUName like #{keyword}")
	@Results({
		@Result(column="OUName",property="userInfo",one=@One(select="com.dyr.dao.UserInfoDao.selectUserByuName")),
		@Result(column="OProvince",property="oProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode")),
		@Result(column="OCity",property="oCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode")),
		@Result(column="OArea",property="oArea",one=@One(select="com.dyr.dao.ZAreaDao.selectAreaByAreaCode"))
	})
	public List<OrderUser> selectOrderListByKeyWord(@Param("keyword")String keyword, @Param("page")int page, @Param("rows")int rows);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-26 下午2:49:48
	 * Description 按关键字模糊查询订单总数 
	 * @param keyword
	 * @return
	 */
	@Select("select COUNT(OId) from orderuser where OUName like #{keyword}")
	public int selectOrderCountByKeyWord(String keyword);

}	
