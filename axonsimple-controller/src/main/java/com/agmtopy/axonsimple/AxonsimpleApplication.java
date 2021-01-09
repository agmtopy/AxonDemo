package com.agmtopy.axonsimple;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.agmtopy.axonsimple", "com.alibaba.cola"})
@MapperScan({"com.agmtopy.axonsimple.gatewayimpl.database"})
public class AxonsimpleApplication {

    public static void main(String[] args) {
        SpringApplication.run(AxonsimpleApplication.class, args);
    }
}
