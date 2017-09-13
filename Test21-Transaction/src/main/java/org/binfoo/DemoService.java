package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
public interface DemoService {
    public Person savePersonWithRollBack(Person person);

    public Person savePersonWithoutRollBack(Person person);
}


