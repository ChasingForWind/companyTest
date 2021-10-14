package com.myinterface;

import java.lang.annotation.*;

/**
 * 年龄校验器
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface AgeValidate {

    int min() default 0;

    int max() default 100;

}
