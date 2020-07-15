package com.tuacy.desinpattern.proxy.statics;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:03.
 */
public class Client {

    public static void main(String[] args) {

        // 被代理的对象
        StaticsRealSubject realSubject = new StaticsRealSubject();
        // 代理对象
        StaticsProxySubject proxySubject = new StaticsProxySubject(realSubject);
        // 代理方法执行
        proxySubject.businessMethod();

    }

}
