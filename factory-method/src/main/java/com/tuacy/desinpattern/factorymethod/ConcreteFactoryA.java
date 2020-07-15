package com.tuacy.desinpattern.factorymethod;

/**
 * 具体工厂 A
 */
public class ConcreteFactoryA extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
