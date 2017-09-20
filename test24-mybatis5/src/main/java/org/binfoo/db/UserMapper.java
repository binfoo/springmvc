package org.binfoo.db;

import org.apache.ibatis.annotations.Param;
import org.binfoo.bean.User;
import org.binfoo.bean.UserParams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by binfoo on 17-1-13.
 */
public interface UserMapper {
    public User getUser(Long id);

    public int insertUser(User user);
    public int insertUser2(User user);

    public int deleteUser(Long id);

    public ArrayList<User> getAll();

    public List<User> getUserByAddressAndName(@Param("username") String username, @Param("address") String address);
    public ArrayList<User> getUserByAddressAndName2(Map<String, String> map);
    public ArrayList<User> getUserByAddressAndName3(UserParams params);

    public int getCount();
}
