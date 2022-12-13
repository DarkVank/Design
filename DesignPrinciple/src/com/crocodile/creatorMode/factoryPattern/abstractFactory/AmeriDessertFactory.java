package com.crocodile.creatorMode.factoryPattern.abstractFactory;
/**
 * @version v1.0
 * @ClassName：AmeriDessertFactory
 * @Description:美式工厂
 * @Author：crocodilePole
 */
public class AmeriDessertFactory implements DessertFactory {

    @Override
    public Coffee createCoffee() {
        return new AmeriCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Matcha();
    }
}
