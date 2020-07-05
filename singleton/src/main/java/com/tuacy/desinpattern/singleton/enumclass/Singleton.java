package com.tuacy.desinpattern.singleton.enumclass;

/**
 * 枚举实现单例模式(强烈推荐使用)
 * - 线程安全        yes
 * - 懒加载          yes
 * - 避免反射攻击     yes
 * 反射在通过newInstance创建对象时，会检查该类是否ENUM修饰，如果是则抛出异常，反射失败。
 */
public enum Singleton {

    /**
     * 默认枚举实例的创建是线程安全的,且在任何情况下它都是单例,包括反序列化
     */
    INSTANCE;

    Singleton(){}

}
