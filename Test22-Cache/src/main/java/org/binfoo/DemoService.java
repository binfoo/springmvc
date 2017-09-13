package org.binfoo;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */

public interface DemoService {
    public Person save(Person person);

    public void remove(Long id);

    public Person findOne(Person person);
}
