package com.tuacy.desinpattern.singleton.staticinnerclass;

/**
 * 静态内部类单例
 * - 线程安全 yes
 * - 懒加载   yes
 */
public class Singleton {

    private Singleton() {
    }

    /**
     * 当第一次加载Singleton类的时候并不会初始化instance，只有第一次调用getInstance()方法的时候才会初始化instance
     * 第一次调用getInstance 方法的时候虚拟机才会加载SingletonHoder类,这种方式不仅能够保证线程安全,也能够保证对象的唯一,
     */
    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

}
