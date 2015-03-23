/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.YCity;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:YCityService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:33:24
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class YCityService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:39:20
	 * Description 获取所有城市数据
	 * @return
	 */
	public List<YCity> getAllCity() {
		
		return ServiceUtil.cityDao.selectAllCity();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午2:09:38
	 * Description 根据城市代码查询城市信息
	 * @param shi
	 * @return
	 */
	public YCity getCityByCityCode(String cityCode) {
		
		return ServiceUtil.cityDao.selectCityByCityCode(cityCode);
	}

}
