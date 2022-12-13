package com.crocodile.creatorMode.factoryPattern.factoryMethod;
/**
 * @version v1.0
 * @ClassName：LatterCoffeeFactory
 * @Description:测试
 * @Author：crocodilePole
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
