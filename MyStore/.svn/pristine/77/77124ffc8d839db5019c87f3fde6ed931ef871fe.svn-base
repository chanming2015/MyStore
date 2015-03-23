/*
 *www.dyr.com
 *Copyright (c) 2014 All Rights Reserved
 */
/**
 * Author XuMaoSen
 */
package com.dyr.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.dyr.entity.Category;

/**
 * Project:MyStore
 * Package:com.dyr.dao
 * FileName:CategoryDao.java
 * Comments:
 * JDK Version:
 * Author XuMaoSen
 * Create Date:2015-1-4 上午9:21:38
 * Modified By:XuMaoSen
 * Modified Time:
 * What is Modified:
 * Version:
 */
public interface CategoryDao {

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午9:44:30
	 * Description 插入新类别
	 * @param category
	 * @return
	 */
	@Insert("insert into Category values(#{cRoot},#{cName},#{cAbout})")
    int insertCategory(Category category);
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午9:44:35
	 * Description 根据类别编号删除类别
	 * @param cId
	 * @return
	 */
	@Delete("delete from Category where CId=#{cId}")
	int deleteCategoryById(int cId);
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午9:44:35
	 * Description 根据类别编号修改类别名称
	 * @param cId
	 * @return
	 */
	@Delete("update Category set CName=#{cName}, CAbout=#{cAbout} where CId=#{cId}")
	int updateCategoryById(@Param("cName")String cName,@Param("cAbout")String cAbout,@Param("cId")int cId);
	
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 上午9:44:39
	 * Description 根据上级ID查询所有类别
	 * @param root
	 * @return
	 */
	@Select("select * from Category where CRoot=#{root}")
	List<Category> selectCategoryByRoot(int root);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-4 下午3:51:18
	 * Description 根据类别编号查询类别
	 * @param cateId
	 * @return
	 */
	@Select("select * from Category where CId=#{cateId}")
	Category selectCategoryByCateId(int cateId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-13 下午2:05:38
	 * Description 查询所有类别
	 * @return
	 */
	@Select("select * from Category")
	List<Category> selectAllCategory();

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-14 下午2:58:18
	 * Description 根据类别编号查询父级编号
	 * @param cateId
	 * @return
	 */
	@Select("select CRoot from Category where CId=#{cateId}")
	int selectRootByCateId(int cateId);

	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:46:18
	 * Description 根据父级编号分页查询类别集合
	 * @param cRoot
	 * @param page
	 * @param rows
	 * @return
	 */
	@Select("select top (#{rows}) * from Category where CId not in (select top ((#{page}-1)*#{rows}) CId from Category) and CRoot=#{cRoot}")
	List<Category> selectCategoryByPageAndToot(@Param("cRoot")int cRoot, @Param("page")int page, @Param("rows")int rows);
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午5:00:21
	 *Description: 模糊查询分页
	 *@param cRoot
	 *@param page
	 *@param rows
	 *@return
	 */
	@Select("select top (#{rows}) * from Category where CId not in (select top ((#{page}-1)*#{rows}) CId from Category where cName like #{keyWord}) and CRoot=#{cRoot} and cName like #{keyWord}")
	List<Category> selectCategoryBykeyWord(@Param("cRoot")int cRoot,@Param("keyWord")String keyWord, @Param("page")int page, @Param("rows")int rows);
	/**
	 * @author XuMaoSen
	 * Create Time:2015-1-20 下午5:51:15
	 * Description 根据父级编号查询类别总数
	 * @param cRoot
	 * @return
	 */
	@Select("select COUNT(CId) from Category where CRoot=#{cRoot}")
	int selectCountByRoot(int cRoot);
	
	/**
	 * 
	 *@author linlin
	 *Create Time:2015-1-23 下午4:18:05
	 *Description: 模糊查询的类别数量
	 *@param keyWord
	 *@return
	 */
	@Select("select COUNT(*) from Category where cName like #{keyWord} and CRoot=#{cRoot}")
	int getCategoryCountByKeyWord(@Param("keyWord")String keyWord,@Param("cRoot")int cRoot);
	
}
