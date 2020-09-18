package com.example.apt_annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface RouterPushUri {


    /**
     * code
     */
    String code() default "";



    /**
     *  code 码 描述
     */
    String codeDescribe() default "";
}
