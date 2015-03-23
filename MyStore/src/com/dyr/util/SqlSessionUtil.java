package com.dyr.util;

import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {
	
	public static SqlSession getSqlSession() {
		// 1.获取mybatis的配置文件
		String resource = "mybatis_configuration.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 2.获取SQLSessionFactory对象
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
				.build(inputStream);
		// 3.获取SQLSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();
		return sqlSession;
	}
}
