package com.crocodile.creatorMode.factoryPattern.extend;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {

        Coffee coffee = SimpleCoffeeFactory.createCoffee("Latter");
        System.out.println(coffee.getName());
    }
}
