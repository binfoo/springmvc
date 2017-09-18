package org.binfoo;

import org.apache.ibatis.session.SqlSession;
import org.binfoo.bean.User;
import org.binfoo.db.DBUtils;
import org.binfoo.db.UserMapper;
import org.junit.Test;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public class Main {
    @Test
    public void test1() {


        SqlSession sqlSession = null;

        try {


            sqlSession = DBUtils.getSqlSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            User user = userMapper.getUser(1L);

            System.out.println(user);

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


    @Test
    public void test2() {


        SqlSession sqlSession = null;

        try {


            sqlSession = DBUtils.getSqlSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            for (int i = 0; i < 3; i++) {
                userMapper.insertUser(new User(null, "u-" + i, "p-" + i, "a-" + i));
            }


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

    @Test
    public void test3() {


        SqlSession sqlSession = null;

        try {


            sqlSession = DBUtils.getSqlSession();

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            userMapper.deleteUser(7L);


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
