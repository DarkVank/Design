package com.crocodile.creatorMode.singletonPattern.EagerSingleton;
/**
 * @version v1.0
 * @ClassName：Singleton
 * @Description:单例类
 * @Author：crocodilePole
 */
public class Singleton {

    private Singleton(){}

    private static Singleton instance ;//= new Singleton();

    static{
        instance = new Singleton();
    }

    public static Singleton getInstance(){
        return instance;
    }
}
