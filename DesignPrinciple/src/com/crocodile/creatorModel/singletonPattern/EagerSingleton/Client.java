package com.crocodile.creatorModel.singletonPattern.EagerSingleton;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        SingletonE instance2 = SingletonE.INSTANCE;
        SingletonE instance3 = SingletonE.INSTANCE;
        System.out.println(instance2 == instance3);
    }
}
