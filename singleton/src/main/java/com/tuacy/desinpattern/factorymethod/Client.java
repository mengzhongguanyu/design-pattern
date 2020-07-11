package com.tuacy.desinpattern.factorymethod;

/**
 * @author wuyx
 * @version 1.0
 * @date 2020/7/11 15:06
 */
public class Client {

    public static void main(String[] args) {
        // 需要A产品，找到A产品对应的工厂
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();

        // 需要B产品，找到B产品对应的工厂
        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
    }

}
