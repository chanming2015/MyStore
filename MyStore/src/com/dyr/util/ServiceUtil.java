/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.util;

import org.apache.ibatis.session.SqlSession;

import com.dyr.dao.AttributeCategoryDao;
import com.dyr.dao.AttributeValueDao;
import com.dyr.dao.CategoryDao;
import com.dyr.dao.DiscussDao;
import com.dyr.dao.GoodsDao;
import com.dyr.dao.ImageGoodsDao;
import com.dyr.dao.InfoOrderGoodsDao;
import com.dyr.dao.OrderUserDao;
import com.dyr.dao.ProductCartDao;
import com.dyr.dao.ResponseDao;
import com.dyr.dao.StockDao;
import com.dyr.dao.UserInfoDao;
import com.dyr.dao.VipCartDao;
import com.dyr.dao.XProvinceDao;
import com.dyr.dao.YCityDao;
import com.dyr.dao.ZAreaDao;

/**
 * Project:MyStore
 * Package:com.dyr.util
 * FileName:ServiceUtil.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-14 下午4:25:10
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
 public class ServiceUtil {

	/**
	 * 获取SqlSession
	 */
	public static SqlSession sqlSession=SqlSessionUtil.getSqlSession();
	/**
	 * 获取CategoryDao
	 */
	 public static CategoryDao categoryDao=sqlSession.getMapper(CategoryDao.class);
	/**
	 * 获取GoodsDao
	 */
	 public static GoodsDao goodsDao=sqlSession.getMapper(GoodsDao.class);
	/**
	 * 获取ImageGoodsDao
	 */
	 public static ImageGoodsDao imageGoodsDao=sqlSession.getMapper(ImageGoodsDao.class);
	/**
	 * 获取InfoOrderGoodsDao
	 */
	 public static InfoOrderGoodsDao infoOrderGoodsDao=sqlSession.getMapper(InfoOrderGoodsDao.class);
	/**
	 * 获取OrderUserDao
	 */
	 public static OrderUserDao orderUserDao=sqlSession.getMapper(OrderUserDao.class);
	/**
	 * 获取ProductCartDao
	 */
	 public static ProductCartDao productCartDao=sqlSession.getMapper(ProductCartDao.class);
	/**
	 * 获取StockDao
	 */
	 public static StockDao stockDao=sqlSession.getMapper(StockDao.class);
	/**
	 * 获取UserInfoDao
	 */
	 public static UserInfoDao userInfoDao=sqlSession.getMapper(UserInfoDao.class);
	/**
	 * 获取VipCartDao
	 */
	 public static VipCartDao vipCartDao=sqlSession.getMapper(VipCartDao.class);
	 /**
	  * 获取XProvinceDao
	  */
	 public static XProvinceDao provinceDao=sqlSession.getMapper(XProvinceDao.class);
	 /**
	  * 获取YCityDao
	  */
	 public static YCityDao cityDao=sqlSession.getMapper(YCityDao.class);
	 /**
	  * 获取ZAreaDao
	  */
	 public static ZAreaDao areaDao=sqlSession.getMapper(ZAreaDao.class);
	 /**
	  * 获取DiscussDao
	  */
	 public static DiscussDao discussDao = sqlSession.getMapper(DiscussDao.class);
	 /**
	  * 获取ResponseDao
	  */
	 public static ResponseDao responseDao = sqlSession.getMapper(ResponseDao.class);
	 /**
	  * 获取AttributeCategoryDao
	  */
	 public static AttributeCategoryDao attributeCategoryDao=sqlSession.getMapper(AttributeCategoryDao.class);
	 /**
	  * 获取AttributeValueDao
	  */
	 public static AttributeValueDao attributeValueDao=sqlSession.getMapper(AttributeValueDao.class);
	/**
	 * 增加、删除、修改后执行
	 */
	 public static void commit(){
		sqlSession.commit();
	}
}
