package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: zhiyang
 * @description: 测试spring
 * @create: 2021-10-14 17:31
 **/


@SpringBootApplication
public class Application {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfiguration.class);

        System.out.println(context.getBean(User.class));
    }
}
