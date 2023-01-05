package com.crocodile.creatorModel.factoryPattern2.simpleFactory;
/**
 * @version v1.0
 * @ClassName：CoffeeStore
 * @Description:咖啡
 * @Author：crocodilePole
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type){
        Coffee coffee = SimpleCoffeeFactory.createCoffee(type);

        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
