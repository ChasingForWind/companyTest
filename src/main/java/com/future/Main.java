package com.future;

import com.future.asyn.ExecuteAsynMethod;
import com.future.asyncresult.ExecuteAsynMethodResult;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author: zhiyang
 * @description: 测试入口
 * @create: 2021-10-29 14:23
 **/


@SpringBootApplication(scanBasePackages = "com.future")
@EnableAsync
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

//        ExecuteAsynMethod asynTestMain = (ExecuteAsynMethod) context.getBean("executeAsynMethod");
//        asynTestMain.test();

        ExecuteAsynMethodResult executeAsynMethodResult = (ExecuteAsynMethodResult) context.getBean("executeAsynMethodResult");
        System.out.println(executeAsynMethodResult.test());
    }
}
