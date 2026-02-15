package com.ring.personnel;

import org.mybatis.spring.annotation.MapperScan; // <--- 1. 记得导入这个包
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ring.personnel.mapper") // <--- 2. 核心就是加这一行！
public class PersonnelServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonnelServiceApplication.class, args);
    }

}