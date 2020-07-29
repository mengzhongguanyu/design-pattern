package com.tuacy.desinpattern.bridge;

import com.tuacy.desinpattern.bridge.memeory.IMemory;
import com.tuacy.desinpattern.bridge.system.ISystem;

/**
 * 对应桥接模式中的，Abstraction
 *
 * @version 1.0
 * @author: tuacy.
 * @date: 2020/7/29 20:01.
 */
public abstract class Phone {

    private ISystem system;
    private IMemory memory;

    public Phone(ISystem system, IMemory memory) {
        this.system = system;
        this.memory = memory;
    }

    public ISystem getSystem() {
        return system;
    }

    public void setSystem(ISystem system) {
        this.system = system;
    }

    public IMemory getMemory() {
        return memory;
    }

    public void setMemory(IMemory memory) {
        this.memory = memory;
    }
}
