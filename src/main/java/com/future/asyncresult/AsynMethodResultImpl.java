package com.future.asyncresult;

import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author: zhiyang
 * @description: 异步方法实现接口
 * @create: 2021-10-29 15:31
 **/


@Component
public class AsynMethodResultImpl implements AsynMethodResult {

    @Override
    public Future<Integer> count_1() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result = result + i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>(result);
    }

    @Override
    public Future<Integer> count_2() {
        int result = 0;
        for (int i = 10; i < 20; i++) {
            result = result + i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>(result);
    }

    @Override
    public Future<Integer> count_3() {
        int result = 0;
        for (int i = 20; i < 30; i++) {
            result = result + i;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return new AsyncResult<>(result);
    }
}
