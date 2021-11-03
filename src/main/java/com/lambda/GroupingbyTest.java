package com.lambda;

import com.google.common.base.Joiner;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author: zhiyang
 * @description: 分组测试
 * @create: 2021-10-28 10:59
 **/


public class GroupingbyTest {

    private final static String SPLIT_CHAR = "^";

    public static void main(String[] args) {

        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950),
                new Transaction(alan, 2012, 950),
                new Transaction(alan, 2012, 950),
                new Transaction(alan, 2012, 950)

        );


        Function<Transaction, @Nullable String> buildKeyFunction = t -> buildKey(t.getYear(),t.getValue());
        Map<@Nullable String, List<Transaction>> collect = transactions
                .stream()
                .filter(Objects::nonNull)
                .collect(Collectors.groupingBy(buildKeyFunction));

        System.out.println(collect);

    }

    /**
     * 返回年和金额的组合值
     * @param year 年
     * @param value 金额
     * @return 返回key值
     */
    public static String buildKey(int year, int value){
        return Joiner.on(SPLIT_CHAR).join(year,value);
    }


}
