package com.crocodile.creatorMode.factoryPattern.simpleFactory;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
        CoffeeStore coffeeStore = new CoffeeStore();
        Coffee coff = coffeeStore.orderCoffee("latte");

        System.out.println(coff.getName());
    }
}
