package com.clone;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        //浅克隆
        User user = getUser();
        User newUser = new User();
        BeanUtils.copyProperties(newUser,user);
        System.out.println(user==newUser);
        System.out.println(user.getAddress()==newUser.getAddress());

        //不同类之间复制
        Man man = new Man("智阳","24","183");
        BeanUtils.copyProperties(man,user);
        System.out.println(man);
    }


    private static User getUser() {
        User user = new User();
        user.setName("刘畅");
        user.setAge("18");
        user.setAddress(new Address("重庆","几江"));
        return user;
    }
}
