package com.wei.mvcframework.annotation;

import java.lang.annotation.*;

/**
 * @author wei
 * @date 2019/7/3-22:31
 */
@Target({ElementType.TYPE})//作用于类上
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface WeiService {
    String  value() default "";
}
