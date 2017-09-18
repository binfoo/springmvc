package org.binfoo.db;

import org.binfoo.bean.User;

/**
 * Created by ZhangHongbin on 2017/9/18.
 */
public interface UserMapper {
    public User getUser(Long id);

    public int insertUser(User user);

    public int deleteUser(Long id);
}

