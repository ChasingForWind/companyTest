package com.myinterface;


import java.lang.annotation.*;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyPeople {
    /*
    人名
     */
    String value()default "111";
}
