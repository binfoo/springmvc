package org.binfoo;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * 1.@ResponseBody 这个注解可以让我们将返回值放在response体内，
 * 而不是返回一个html页面，当我们在移动端比如Android、或者通过Ajax来访问服务端的数据的时候，就可以通过这个注解。
 2.@RequestBody 这个注解允许request的参数在request体中，而不是直接放在地址后面。
 3.@PathVariable 这个注解用来接收路径参数
 4.@RestController 这是一个组合注解，组合了@Controller和@ResponseBody两个，在开发中我们可以用@RestController这一个，
 也可以用后面两个，使用这个可以自动将一个对象转为xml或者json返回给客户端。
 */

/**
 * Created by binfoo on 2017/9/9.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    //http://localhost:8080/user/
    @ResponseBody
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public String user(HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access";
    }

    //http://localhost:8080/user/user/张三

    @ResponseBody
    @RequestMapping(value = "/user/{str}",produces = "text/plain;charset=utf-8")
    public String pathVar(@PathVariable String str,HttpServletRequest request){
        //url:http://localhost:8080/user/user/%E5%BC%A0%E4%B8%89 can access , str is 张三
        return "url:" + request.getRequestURL() + " can access,str is " + str;
    }

    //http://localhost:8080/user/rp?id=100
    @ResponseBody
    @RequestMapping(value = "/rp",produces = "text/plain;charset=UTF-8")
    public String requestParams(long id,HttpServletRequest request){
        //url:http://localhost:8080/user/rp can access , username is :100
        return "url:" + request.getRequestURL()+" can access and username is " + id;
    }

    //http://localhost:8080/user/json?username=%E5%BC%A0%E4%B8%89&password=123
    @ResponseBody
    @RequestMapping(value = "json",produces = "application/json;charset=UTF-8")
    public String passObj(UserBean user,HttpServletRequest request){
        Gson gson = new Gson();
        //{"username":"张三","password":"123"}
        return gson.toJson(user);
    }

    @ResponseBody
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public UserBean passObj(UserBean user){
        return user;
    }


    //http://localhost:8080/user/n1
    //http://localhost:8080/user/n2
    @ResponseBody
    @RequestMapping(value = {"/n1","/n2"},produces = "text/plain;charset=UTF-8")
    public String group(){
        return "不同路径定位到同一方法";
    }



}