package com.crocodile.creatorMode.factoryPattern.extend;

import com.crocodile.creatorMode.factoryPattern.factoryMethod.CoffeeFactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @version v1.0
 * @ClassName：SimpleCoffeeFactory
 * @Description:咖啡工厂
 * @Author：crocodilePole
 */
public class SimpleCoffeeFactory {

    private static Map<String,Coffee> map = new HashMap<>();

    static{
        Properties p = new Properties();
        InputStream is = CoffeeFactory.class.getClassLoader().getResourceAsStream("bean.properties");

        try {
            p.load(is);
            //从p集合中获取全类名并创建对象
            Set<Object> keys = p.keySet();
            for (Object key : keys) {
                //通过键值获取 全类名
                String className = p.getProperty((String) key);
                //反射获取实例
                Class clazz = Class.forName(className);
                Coffee coffee = (Coffee) clazz.newInstance();
                //将对象存储进map容器
                map.put((String)key ,coffee);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Coffee createCoffee(String type){

        Coffee coffee = map.get(type);
        return coffee;
    }
}
