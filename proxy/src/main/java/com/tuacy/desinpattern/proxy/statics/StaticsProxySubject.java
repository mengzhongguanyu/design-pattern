package com.tuacy.desinpattern.proxy.statics;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:00.
 */
public class StaticsProxySubject implements IStaticSubject {

    private IStaticSubject subject;

    public StaticsProxySubject(IStaticSubject subject) {
        this.subject = subject;
    }

    @Override
    public void businessMethod() {
        System.out.println("静态代理，代理对象的业务实现方法执行");
        subject.businessMethod();
    }
}
