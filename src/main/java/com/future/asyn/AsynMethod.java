package com.future.asyn;

import com.future.asyn.AsyncTestInterface;
import org.springframework.stereotype.Component;

/**
 * @author: zhiyang
 * @description: 异步方法类
 * @create: 2021-10-29 10:43
 **/

@Component
public class AsynMethod implements AsyncTestInterface {
    @Override
    public void asynchronousMethod1() {
        System.out.println("异步方法1开始：");
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(1+ " ");
                Thread.sleep(10);
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void asynchronousMethod2() {
        System.out.println("异步方法2开始：");
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(2+ " ");
                Thread.sleep(20);
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void asynchronousMethod3() {
        System.out.println("异步方法3开始：");
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(3+ " ");
                Thread.sleep(30);
            }
            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
