package com.tuacy.desinpattern.factorymethod;

/**
 * 具体工厂 B
 */
public class ConcreteFactoryB extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
