package com.future.asyncresult;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Nullable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author: zhiyang
 * @description: 执行异步方法
 * @create: 2021-10-29 15:35
 **/

@Component
public class ExecuteAsynMethodResult {

    @Autowired
    AsynMethodResult asynMethodResult;

    public int test() {
        Future<Integer> integerFuture_1 = asynMethodResult.count_1();
        Future<Integer> integerFuture_2 = asynMethodResult.count_2();
        Future<Integer> integerFuture_3 = asynMethodResult.count_3();

        Integer result_1 = null;
        Integer result_2 = null;
        Integer result_3 = null;
        try {
            result_1 = integerFuture_1.get();
            result_2 = integerFuture_2.get();
            result_3 = integerFuture_3.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return 0;
        }

        return  result_1+result_2+result_3;
    }
}
