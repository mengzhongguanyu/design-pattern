package com.tuacy.desinpattern.singleton.hungry;

/**
 * 饿汉式-单例模式
 * - 线程安全
 * - 非懒加载模式
 */
public class Singleton {

    /**
     * 饿汉式是在声明的时候已经初始化了Singleton确保了对象的唯一性，线程安全
     * 但是，有个缺点就是，无法延时加载(第一次使用的时候才加载对象)
     */
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }

}
