package org.binfoo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.IllegalTransactionStateException;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ZhangHongbin on 2017/9/13.
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = IllegalArgumentException.class)
    public Person savePersonWithRollBack(Person person) {
        Person p = personRepository.save(person);

        if (person.getName().equals("binfoo")) {
            throw new IllegalArgumentException("binfoo 已存在，数据将回滚");
        }
        return p;
    }

    @Override
    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public Person savePersonWithoutRollBack(Person person) {
        Person p = personRepository.save(person);
        if (person.getName().equals("binfoo")){
            throw new IllegalArgumentException("binfoo已存在，但数据不回滚");
        }

        return p;
    }
}
