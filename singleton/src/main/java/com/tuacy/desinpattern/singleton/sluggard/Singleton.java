package com.tuacy.desinpattern.singleton.sluggard;

/**
 * 懒汉式单例
 * - 线程安全        no
 * - 懒加载          yes
 * - 避免反射攻击     no
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
