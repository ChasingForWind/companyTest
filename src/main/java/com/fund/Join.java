package com.fund;

import com.google.common.base.Joiner;

public class Join {
    public static void main(String[] args) {
        String join = Joiner.on('|').join("1", "2", "3","4","5");
        System.out.println(join);
    }
}
