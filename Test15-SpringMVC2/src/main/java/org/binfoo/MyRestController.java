package org.binfoo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by binfoo on 2017/9/9.
 */
@RestController
@RequestMapping("/rest")
public class MyRestController {
    //http://localhost:8080/rest/getJson?username=%E5%BC%A0%E4%B8%89&password=999
    @RequestMapping(value = "/getJson",produces = "application/json;charset=UTF-8")
    public UserBean getJson(UserBean userBean){
        return userBean;
    }

    //http://localhost:8080/rest/getXml?username=%E5%BC%A0%E4%B8%89&password=999
    @RequestMapping(value = "/getXml",produces = "application/xml;charset=UTF-8")
    public UserBean getXML(UserBean userBean) {
        return userBean;
    }

}