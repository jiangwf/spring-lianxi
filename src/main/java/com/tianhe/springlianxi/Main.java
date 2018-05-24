package com.tianhe.springlianxi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * weifeng.jiang 2018-05-24 16:34
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Demo demo = (Demo) context.getBean("demo");
        System.out.println(demo);
    }
}
