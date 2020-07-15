package com.tuacy.desinpattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:08.
 */
public class CglibMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("Cglib动态代理前置处理！！！");
        Object object = proxy.invokeSuper(obj, args);
        System.out.println("Cglib动态代理后置处理！！！");
        return object;
    }
}
