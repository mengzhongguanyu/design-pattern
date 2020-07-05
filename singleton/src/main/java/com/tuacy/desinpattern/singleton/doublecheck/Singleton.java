package com.tuacy.desinpattern.singleton.doublecheck;

/**
 * 双重校验单例
 * - 线程安全        yes
 * - 懒加载          yes
 * - 避免反射攻击     no
 */
public class Singleton {

    // 我们还添加了volatile关键字防止指令重排序
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        /*
        1. getInstance()方法上我们是没有添加synchronized关键字的。
        2. 两重if判断，在第二个if之前添加了同步关键字synchronized
         */
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
