package com.tuacy.desinpattern.simplefactory;

/**
 * 简单工厂模式 - 工厂类
 * @author wuyx
 * @version 1.0
 * @date 2020/7/11 0:04
 */
public class Factory {

    /**
     * 工厂方法，创建产品
     * @param type 指定产品的类型
     * @return 产品
     */
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ConcreteProductA();
        } else {
            return new ConcreteProductB();
        }
    }

}
