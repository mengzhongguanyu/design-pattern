package com.tuacy.desinpattern.singleton.sluggard;

/**
 * 懒汉式单例
 * - 线程不安全
 * - 懒加载
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        /*
        当需要获取对象的时候，首先判断对象是否已经进行过实例化了
         */
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
