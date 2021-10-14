package com.myinterface;

import java.lang.reflect.Field;

/**
 * @author: zhiyang
 * @description: 获取注解工具类
 * @create: 2021-10-13 15:43
 **/


public class InterfaceUtil {
    /*
    获取注解名字
     */
    public static void getName(People people){
        Class clazz = people.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(MyPeople.class)){
                MyPeople peopleName = field.getAnnotation(MyPeople.class);
                System.out.println("people name is :" + peopleName.value());
            }
        }
    }

    /*
    年龄校验
     */
    public static void validateAge(People people){
        Class clazz = people.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(AgeValidate.class)){
                AgeValidate annotation = field.getAnnotation(AgeValidate.class);
                int min = annotation.min();
                int max = annotation.max();

                if (people.age<min||people.age>max){
                    throw new RuntimeException("年龄超过年限");
                }
            }
        }
    }
}
