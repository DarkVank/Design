package com.crocodile.creatorMode.factoryPattern.simpleFactory;
/**
 * @version v1.0
 * @ClassName：SimpleCoffeeFactory
 * @Description:咖啡工厂
 * @Author：crocodilePole
 */
public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type){

        if("latte".equals(type)){
            LatteCoffee coffee = new LatteCoffee();
            return coffee;
        }else{
            throw new RuntimeException("对不起没有这种咖啡");
        }

    }
}
