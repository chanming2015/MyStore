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

import com.dyr.entity.ZArea;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:ZAreaDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:32:45
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface ZAreaDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:56:51
	 * Description 查询所有地区信息
	 * @return
	 */
	@Select("select * from ZArea")
	@Results({
		@Result(column="ZCitycode",property="yCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode"))
	})
	List<ZArea> selectAllArea();

	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午10:10:18
	 * Description 根据地区代码查询地区信息
	 * @param areaCode
	 * @return
	 */
	@Select("select * from ZArea where ZCode=#{areaCode}")
	@Results({
		@Result(column="ZCitycode",property="yCity",one=@One(select="com.dyr.dao.YCityDao.selectCityByCityCode"))
	})
	ZArea selectAreaByAreaCode(String areaCode);
}
