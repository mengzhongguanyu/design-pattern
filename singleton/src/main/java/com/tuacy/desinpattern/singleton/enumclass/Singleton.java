package com.tuacy.desinpattern.singleton.enumclass;

/**
 * 枚举实现单例模式(强烈推荐使用)
 */
public enum Singleton {

    /**
     * 默认枚举实例的创建是线程安全的,且在任何一种情况下它都是单例,包括反序列化
     */
    INSTANCE;

    Singleton(){}

}
