package com.tuacy.desinpattern.bridge.memeory;

/**
 * 手机的当中的一个维度内存，对弈桥接模式中的Implementor
 * 内存有多种实现，8G内存，16G内存
 * 可以设计成接口也可以设计成abstract class
 */
public interface IMemory {

    String memorySize();

}
