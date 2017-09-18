package org.binfoo.db;

import org.apache.ibatis.annotations.Select;
import org.binfoo.bean.User;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public interface UserMapper {


    @Select(value = "select * from user where id=#{id}")
    public User getUser(Long id);
}
