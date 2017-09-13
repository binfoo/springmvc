package org.binfoo;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
public interface SysUserRepository extends JpaRepository<SysUser,Long>{
    SysUser findByUsername(String username);
}
