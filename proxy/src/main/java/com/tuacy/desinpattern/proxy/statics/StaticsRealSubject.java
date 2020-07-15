package com.tuacy.desinpattern.proxy.statics;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 20:53.
 */
public class StaticsRealSubject implements IStaticSubject {
    @Override
    public void businessMethod() {
        System.out.println("静态代理，真实对象的业务实现方法执行");
    }
}
