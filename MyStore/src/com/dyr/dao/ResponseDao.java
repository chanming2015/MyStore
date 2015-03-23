/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:ResponseDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-20 上午11:20:20
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface ResponseDao {
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午1:50:24
	 *Description: 添加回复
	 *@return
	 */
	@Insert("Insert into Response values(#{rDId},#{rBody},default)")
	@Result(column="RDId",property="discuss",one=@One(select="com.dyr.dao.DiscussDao.selectDiscussBydId"))
	int addResponse(@Param("rDId")int rDId,@Param("rBody")String rBody);
	
}
