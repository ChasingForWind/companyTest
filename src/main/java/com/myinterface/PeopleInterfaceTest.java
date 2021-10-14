package com.myinterface;

/**
 * @author: zhiyang
 * @description: 人名注解测试类
 * @create: 2021-10-13 15:32
 **/


public class PeopleInterfaceTest {
    public static void main(String[] args) {
        People people = new People("刘畅", 55);
        InterfaceUtil.getName(people);
        InterfaceUtil.validateAge(people);
    }
}
