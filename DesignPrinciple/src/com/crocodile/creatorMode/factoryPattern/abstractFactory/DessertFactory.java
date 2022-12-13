package com.crocodile.creatorMode.factoryPattern.abstractFactory;
/**
 * @version v1.0
 * @ClassName：DesertFactory
 * @Description:抽象工厂
 * @Author：crocodilePole
 */
public interface DessertFactory {
    public Coffee createCoffee();
    public Dessert createDessert();
}
