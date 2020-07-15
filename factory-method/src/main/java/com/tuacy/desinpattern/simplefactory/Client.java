package com.tuacy.desinpattern.simplefactory;

/**
 * 客户端调用
 */
public class Client {

    public static void main(String[] args) {
        Product product = Factory.createProduct("A");
        product.commonMethod();
        product.diffMethod();
    }

}
