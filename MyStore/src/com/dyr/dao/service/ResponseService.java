/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.dao.service;

import com.dyr.entity.Response;
import com.dyr.util.ServiceUtil;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.dao.service
 *FileName:ResponseService.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-23 下午1:51:10
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public class ResponseService {
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午1:53:31
	 *Description: 添加回复
	 *@return
	 */
	public int addResponse(int rDId, String rBody){
		int row = ServiceUtil.responseDao.addResponse(rDId,rBody);
		ServiceUtil.commit();
		return row;
	}
}
