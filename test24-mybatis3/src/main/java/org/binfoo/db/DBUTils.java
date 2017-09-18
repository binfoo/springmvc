package org.binfoo.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public class DBUtils {
    private static SqlSessionFactory sqlSessionFactory = null;
    private static final Class CLASS_LOCK = DBUtils.class;


    public static SqlSessionFactory initSqlSessionFactory(){
        InputStream is = null;
        try {
            is= Resources.getResourceAsStream("mybatis-conf.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        synchronized (CLASS_LOCK){
            if (sqlSessionFactory ==null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            }
        }

        return  sqlSessionFactory;
    }


    public static SqlSession getSqlSession(){
        if (sqlSessionFactory ==null){

            initSqlSessionFactory();
        }

        return sqlSessionFactory.openSession();
    }

}
