package com.tuacy.desinpattern.abstractfactory;

/**
 * @author wuyx
 * @version 1.0
 * @date 2020/7/11 15:26
 */
public class ConcreteFactory1 extends Factory {
    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
