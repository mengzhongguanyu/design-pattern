package com.tuacy.desinpattern.proxy.dynamic.jdk;

import java.lang.reflect.Proxy;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:03.
 */
public class Client {

    public static void main(String[] args) {
        // 需要被代理的目标对象
        JdkRealSubject realSubject = new JdkRealSubject();
        //让jvm动态生成代理类  这就是JDK的动态代理
        IJdkSubject service = (IJdkSubject) Proxy.newProxyInstance(Client.class.getClassLoader(),
                new Class[]{IJdkSubject.class},//被代理类实现的接口
                new JdkProxyInvocationHandler(realSubject));//代理逻辑

        service.businessMethod();
        System.out.println("动态代理类的名字" + service.getClass().getName());
    }

}
