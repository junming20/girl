package com.imooc;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface GirlRepository extends JpaRepository<Girl, Integer> {//继承jpa<类名，id类型>
    //通过年龄来查询
    public List<Girl> findByAge(Integer age);//findByAge不能写错
}
