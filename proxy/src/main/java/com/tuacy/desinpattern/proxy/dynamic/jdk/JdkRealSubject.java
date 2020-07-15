package com.tuacy.desinpattern.proxy.dynamic.jdk;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 20:53.
 */
public class JdkRealSubject implements IJdkSubject {
    @Override
    public void businessMethod() {
        System.out.println("JDK动态代理，真实对象的业务实现方法执行");
    }
}
