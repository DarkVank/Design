package com.crocodile.creatorMode.factoryPattern.abstractFactory;
/**
 * @version v1.0
 * @ClassName：Coffee
 * @Description:咖啡
 * @Author：crocodilePole
 */
public abstract class Coffee {
    public abstract String getName();

    public void addMilk(){
        System.out.println("加奶");
    }

    public void addSugar(){
        System.out.println("加糖");
    }
}
