package com.tuacy.desinpattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:02.
 */
public class JdkProxyInvocationHandler implements InvocationHandler {

    /**
     * 要被代理的目标对象
     */
    private IJdkSubject realSubject;

    public JdkProxyInvocationHandler(IJdkSubject realSubject){
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理前调用!!!");
        Object result = method.invoke(realSubject,args);
        System.out.println("代理后调用!!!");
        return result;
    }
}
