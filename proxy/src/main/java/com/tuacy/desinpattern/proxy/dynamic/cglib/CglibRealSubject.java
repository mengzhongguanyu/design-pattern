package com.tuacy.desinpattern.proxy.dynamic.cglib;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 20:53.
 */
public class CglibRealSubject {

    public void businessMethod() {
        System.out.println("cglib动态代理的真是对象方法调用");
    }

}
