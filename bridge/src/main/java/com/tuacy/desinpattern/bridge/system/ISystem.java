package com.tuacy.desinpattern.bridge.system;

/**
 * 手机的当中的一个维度操作系统，对弈桥接模式中的Implementor
 * 操作有多种实现，Android，IOS
 * 可以设计成接口也可以设计成abstract class
 */
public interface ISystem {

    String operationSystemName();

}
