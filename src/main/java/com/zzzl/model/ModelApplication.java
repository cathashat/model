package com.zzzl.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableJpaRepositories(value = "com.zzzl.model.dao")
@ComponentScan("com.zzzl.model.*")
@EnableSwagger2
@EnableAspectJAutoProxy
public class ModelApplication { 

    public static void main(String[] args) {
        SpringApplication.run(ModelApplication.class, args);
    }

}
