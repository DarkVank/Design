package com.crocodile.creatorModel.factoryPattern2.factoryMethod;

/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {

        LatteCoffeeFactory latteCoffeeFactory = new LatteCoffeeFactory();
        CoffeeStore store = new CoffeeStore(latteCoffeeFactory);
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
