package com.tuacy.desinpattern.bridge.system;

/**
 * 系统维度扩展，对应桥接模式中的ConcreteImplementor
 */
public class SystemAndroid implements ISystem {
    @Override
    public String operationSystemName() {
        return "Android系统";
    }
}
