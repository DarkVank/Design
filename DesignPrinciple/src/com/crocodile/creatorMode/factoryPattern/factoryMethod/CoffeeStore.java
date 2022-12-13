package com.crocodile.creatorMode.factoryPattern.factoryMethod;


/**
 * @version v1.0
 * @ClassName：CoffeeStore
 * @Description:咖啡
 * @Author：crocodilePole
 */
public class CoffeeStore {
    private CoffeeFactory factory;
    public CoffeeStore(CoffeeFactory factory) {
        this.factory = factory;
    }

    public Coffee orderCoffee(){

        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
