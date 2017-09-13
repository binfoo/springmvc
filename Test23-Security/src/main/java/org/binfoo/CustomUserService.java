package org.binfoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
public class CustomUserService implements UserDetailsService{

    @Autowired
    private SysUserRepository sysUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        SysUser sysUser = sysUserRepository.findByUsername(username);

        if (sysUser == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("username:"+username);
        System.out.println("username:"+sysUser.getUsername()+";password:"+sysUser.getPassword());

        return sysUser;
    }
}
