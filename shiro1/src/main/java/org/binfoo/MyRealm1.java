package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/20.
 */

import org.apache.shiro.authc.*;
import org.apache.shiro.realm.Realm;

/**
 * 1.getName()方法用来返回该Realm的唯一名字。
 * 2.supports(AuthenticationToken token)方法用来验证传入的Token是否被支持，因为我们验证方式不仅仅Username和Password这种方式，还有很多其他方式。
 * 3.getAuthenticationInfo(AuthenticationToken token)这个方法用来执行验证操作，并且将验证结果返回。
 */
public class MyRealm1 implements Realm {
    @Override
    public String getName() {
        return "myRealm1";
    }

    @Override
    public boolean supports(AuthenticationToken token) {
        return token instanceof UsernamePasswordToken;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

//        String username = (String) token.getPrincipal();
//        String password = new String(((char[]) token.getCredentials()));
//        if (!"wang".equals(username)) {
//            //用户名错误
//            throw new UnknownAccountException();
//        }
//        if (!"123".equals(password)) {
//            //密码错误
//            throw new IncorrectCredentialsException();
//        }
//        return new SimpleAuthenticationInfo(username, password, getName());

        String username = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());

        if(!"wang".equals(username)){
            throw new UnknownAccountException();
        }

        if(!"123".equals(password)){
            throw new IncorrectCredentialsException();
        }
        return new SimpleAuthenticationInfo(username,password,getName());
    }
}
