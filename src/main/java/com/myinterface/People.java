package com.myinterface;

import lombok.Data;

/**
 * @author: zhiyang
 * @description: 人
 * @create: 2021-10-13 15:34
 **/


public class People {

    @MyPeople(value = "刘畅")
    String name;

    @AgeValidate(min = 18,max = 40)
    Integer age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
