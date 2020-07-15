package com.tuacy.desinpattern.proxy.dynamic.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/15 21:03.
 */
public class Client {

    public static void main(String[] args) {
        //创建Enhancer对象，类似于JDK动态代理的Proxy类，下一步就是设置几个参数
        Enhancer enhancer = new Enhancer();
        //设置目标类的字节码文件
        enhancer.setSuperclass(CglibRealSubject.class);
        //设置回调函数
        enhancer.setCallback(new CglibMethodInterceptor());
        //这里的creat方法就是正式创建代理类
        CglibRealSubject proxy = (CglibRealSubject)enhancer.create();
        //调用代理类的eat方法
        proxy.businessMethod();
    }

}
