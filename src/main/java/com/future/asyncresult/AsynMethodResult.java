package com.future.asyncresult;

import org.springframework.scheduling.annotation.Async;

import java.util.concurrent.Future;

public interface AsynMethodResult {

    @Async
    Future<Integer> count_1();

    @Async
    Future<Integer> count_2();

    @Async
    Future<Integer> count_3();
}
