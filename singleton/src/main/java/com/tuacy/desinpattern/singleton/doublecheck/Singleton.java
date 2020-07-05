package com.tuacy.desinpattern.singleton.doublecheck;

/**
 * 双重校验单例
 * - 线程安全 yes
 * - 懒加载   yes
 */
public class Singleton {

    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
