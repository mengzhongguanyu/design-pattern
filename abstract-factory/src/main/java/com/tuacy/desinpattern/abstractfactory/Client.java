package com.tuacy.desinpattern.abstractfactory;

/**
 * @author wuyx
 * @version 1.0
 * @date 2020/7/11 15:35
 */
public class Client {

    public static void main(String[] args) {
        // 1号产品族对应的工厂
        Factory concreteFactory1 = new ConcreteFactory1();
        // 创建1号产品族里面的A产品
        ProductA product1A = concreteFactory1.createProductA();
        // 创建1号产品族里面的B产品
        ProductB product1B = concreteFactory1.createProductB();

        // 2号产品族对应的工厂
        Factory concreteFactory2 = new ConcreteFactory2();
        // 创建2号产品族里面的A产品
        ProductA product2A = concreteFactory2.createProductA();
        // 创建2号产品族里面的B产品
        ProductB product2B = concreteFactory2.createProductB();
    }

}
