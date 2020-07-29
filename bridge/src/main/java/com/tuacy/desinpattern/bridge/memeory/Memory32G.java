package com.tuacy.desinpattern.bridge.memeory;

/**
 * 内存维度扩展，对应桥接模式中的ConcreteImplementor
 */
public class Memory32G implements IMemory {
    @Override
    public String memorySize() {
        return "32G内存";
    }
}
