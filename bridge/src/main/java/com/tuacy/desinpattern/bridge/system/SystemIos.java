package com.tuacy.desinpattern.bridge.system;

/**
 * 系统维度扩展，对应桥接模式中的ConcreteImplementor
 */
public class SystemIos implements ISystem {
    @Override
    public String operationSystemName() {
        return "IOS系统";
    }
}
