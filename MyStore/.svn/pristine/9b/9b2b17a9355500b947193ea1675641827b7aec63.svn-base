/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.XProvince;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:XProvinceService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:33:42
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class XProvinceService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-21 下午6:37:04
	 * Description 获取所有省
	 * @return
	 */
	public List<XProvince> getAllProvince() {
		
		return ServiceUtil.provinceDao.selectAllProvince();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午2:06:25
	 * Description 根据省代码查询省数据
	 * @param sheng
	 * @return
	 */
	public XProvince getProvinceByProvinceCode(String provinceCode) {
		
		return ServiceUtil.provinceDao.selectProvinceByProvinceCode(provinceCode);
	}

}
