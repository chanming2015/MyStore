/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.dyr.entity.YCity;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:YCityDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:32:36
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface YCityDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:40:05
	 * Description 获取所有城市数据
	 * @return
	 */
	@Select("select * from YCity ")
	@Results({
		@Result(column="YProvincecode",property="xProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode"))
	})
	List<YCity> selectAllCity();
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:54:03
	 * Description 根据城市代码查询城市信息
	 * @param cityCode
	 * @return
	 */
	@Select("select * from YCity where YCode=#{cityCode}")
	@Results({
		@Result(column="YProvincecode",property="xProvince",one=@One(select="com.dyr.dao.XProvinceDao.selectProvinceByProvinceCode"))
	})
	YCity selectCityByCityCode(String cityCode);

}
