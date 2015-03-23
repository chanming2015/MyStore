/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.dyr.entity.XProvince;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:XProvinceDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:32:24
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface XProvinceDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:36:39
	 * Description 获取所有省
	 * @return
	 */
	@Select("select * from XProvince")
	List<XProvince> selectAllProvince();

	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:43:26
	 * Description 根据省代码查询省数据
	 * @param provincecode
	 * @return
	 */
	@Select("select * from XProvince where XCode= #{provincecode}")
	XProvince selectProvinceByProvinceCode(String provincecode);
}
