package com.zkjc.recyc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.zkjc.recyc.mapper")
public class RecycApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecycApplication.class, args);
    }
}