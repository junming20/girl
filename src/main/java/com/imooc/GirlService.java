package com.imooc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service            //
public class GirlService {

    @Autowired          //@Autowired不能写在方法体内
    private GirlRepository girlRepository;

    @Transactional
    public void insertTwo() {

        //new两个女生出来
        Girl girlA = new Girl();
        girlA.setCupSize("A");
        girlA.setAge(18);
        girlRepository.save(girlA);

        Girl girlB = new Girl();
        girlB.setCupSize("A");
        girlB.setAge(19);
        girlRepository.save(girlB);
    }
}
