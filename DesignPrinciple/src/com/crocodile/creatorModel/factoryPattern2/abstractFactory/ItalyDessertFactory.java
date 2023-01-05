package com.crocodile.creatorModel.factoryPattern2.abstractFactory;
/**
 * @version v1.0
 * @ClassName：ItalyDessertFactory
 * @Description:意大利工厂
 * @Author：crocodilePole
 */
public class ItalyDessertFactory implements DessertFactory{

    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
