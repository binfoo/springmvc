package org.binfoo;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.binfoo.bean.User;
import org.binfoo.db.DBUtils;
import org.binfoo.db.UserMapper;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public class Test {

    @org.junit.Test
    public void Test2(){

        SqlSession sqlSession = null;

        try {
            sqlSession = DBUtils.openSqlSession();
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUser(3L);
            System.out.println(user.toString());

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            if (sqlSession !=null){
                sqlSession.close();
            }
        }

    }


    @org.junit.Test
    public void  test3(){

        SqlSession sqlSession = null;
        try{
            sqlSession = DBUtils.openSqlSession();
            User user = (User)sqlSession.selectOne("org.binfoo.db.UserMapper.getUser",1L);

            System.out.println(user.toString());
            sqlSession.commit();

        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();

        }finally {
            if (sqlSession!=null){
                sqlSession.close();
            }
        }
        }

    @org.junit.Test
    public void test4() {
        SqlSession sqlSession = null;
        try {
            sqlSession = DBUtils.openSqlSession();
            User user = (User) sqlSession.selectOne("getUser", 1l);
            System.out.println(user.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    }
