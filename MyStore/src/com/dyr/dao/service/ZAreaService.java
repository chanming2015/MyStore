/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.ZArea;
import com.dyr.util.ServiceUtil;

/**
 * Project:MyStore
 * Package:com.dyr.dao.service
 * FileName:ZAreaService.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-21 下午6:33:13
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public class ZAreaService {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 上午9:56:04
	 * Description 查询所有地区信息
	 * @return
	 */
	public List<ZArea> getAllArea() {
		
		return ServiceUtil.areaDao.selectAllArea();
	}

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-22 下午2:11:07
	 * Description 根据地区代码查询地区信息
	 * @param qu
	 * @return
	 */
	public ZArea getAreaByAreaCode(String areaCode) {
		
		return ServiceUtil.areaDao.selectAreaByAreaCode(areaCode);
	}

}
