package org.binfoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
@RestController
public class MyController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/norollback")
    public Person noRollback(Person person){
        return demoService.savePersonWithoutRollBack(person);
    }


    @RequestMapping("/rollback")
    public Person rollback(Person person){
        return demoService.savePersonWithRollBack(person);
    }


}
