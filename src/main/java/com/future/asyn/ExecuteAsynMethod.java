package com.future.asyn;

import com.future.asyn.AsyncTestInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: zhiyang
 * @description: 执行异步方法
 * @create: 2021-10-29 14:15
 **/



@Component
public class ExecuteAsynMethod {

    @Autowired
    AsyncTestInterface AsynMethod;

    public void test() {
        AsynMethod.asynchronousMethod1();

        AsynMethod.asynchronousMethod2();

        AsynMethod.asynchronousMethod3();

        System.out.println("优先执行主方法。。。。。");
    }
}
