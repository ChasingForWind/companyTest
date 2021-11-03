package com.future.asyn;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author: zhiyang
 * @description: 异步注解接口
 * @create: 2021-10-29 10:41
 **/

public interface AsyncTestInterface {

    @Async
    void asynchronousMethod1();

    @Async
    void asynchronousMethod2();

    @Async
    void asynchronousMethod3();

}
