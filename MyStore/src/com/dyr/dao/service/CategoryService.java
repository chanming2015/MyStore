/*
*www.dyr.com
*Copyright (c) 2014 All Rights Reserved.
*/
/**
 * 
 */
package com.dyr.dao.service;

import java.util.List;

import com.dyr.entity.Category;
import com.dyr.util.ServiceUtil;

/**
 *NewBlush
 *Project:MyStore
 *Package:com.dyr.dao.service
 *FileName:CategoryService.java
 *Comments:
 *JDK Version:
 *Author:林林
 *Create Date:2015-1-13 上午10:39:44
 *Modified By:林林
 *Modified Time:
 *What is Modified:
 *Version
 */
public class CategoryService {
	
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:39:51
	 * Description 添加新类别
	 * @param category
	 * @return
	 */
	public int addnewCategory(Category category){
		int row = ServiceUtil.categoryDao.insertCategory(category);
		ServiceUtil.commit();
		return row;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:40:05
	 * Description 根据类别编号删除类别
	 * @param cId
	 * @return
	 */
	public int deleteCategiry(int cId){
		int row = ServiceUtil.categoryDao.deleteCategoryById(cId);
		ServiceUtil.commit();
		return row;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:40:30
	 * Description 修改类别
	 * @param cName
	 * @param cAbout
	 * @param cId
	 * @return
	 */
	public int updateCategory(String cName,String cAbout,int cId){
		int row = ServiceUtil.categoryDao.updateCategoryById(cName,cAbout, cId);
		ServiceUtil.commit();
		return row;
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:41:13
	 * Description 获取所有类别
	 * @return
	 */
	public List<Category> getAllCategory(){

		return ServiceUtil.categoryDao.selectAllCategory();
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:41:18
	 * Description 根据父级编号查询类别
	 * @param root
	 * @return
	 */
	public List<Category> getCategoryByRoot(int root){
		
		return ServiceUtil.categoryDao.selectCategoryByRoot(root);
	}
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 下午3:49:55
	 * Description 根据类别编号查询类别
	 * @param getgCid
	 * @return
	 */
	public Category getCategoryByCateId(int cateId) {
		
		return ServiceUtil.categoryDao.selectCategoryByCateId(cateId);
	}
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-14 下午2:57:38
	 * Description 根据类别编号查询父级编号
	 * @param getgCid
	 * @return
	 */
	public int getRootByCateId(int cateId) {
		return ServiceUtil.categoryDao.selectRootByCateId(cateId);
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:41:25
	 * Description 根据父级编号分页查询类别集合
	 * @param cRoot
	 * @param page
	 * @param rows
	 * @return
	 */
	public List<Category> selectCategoryByPage(int cRoot,int page,int rows){
		return ServiceUtil.categoryDao.selectCategoryByPageAndToot(cRoot, page, rows);
	}
	/**
	 * 
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:41:28
	 * Description 根据父级编号查询类别总数
	 * @param cRoot
	 * @return
	 */
	public int getCountByRoot(int cRoot){
		return ServiceUtil.categoryDao.selectCountByRoot(cRoot);
	}
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午5:03:13
	 *Description: 模糊查询类别
	 *@param cRoot
	 *@param keyWord
	 *@param page
	 *@param rows
	 *@return
	 */
	public List<Category> selectCategoryBykeyWord(int cRoot,String keyWord,int page,int rows){
		return ServiceUtil.categoryDao.selectCategoryBykeyWord(cRoot, keyWord, page, rows);
	}
	
	public int getCategoryCountBykeyWord(String keyWord,int cRoot){
		return ServiceUtil.categoryDao.getCategoryCountByKeyWord(keyWord,cRoot);
	}
}
