package com.crocodile.creatorMode.singletonPattern.lazySingleton;
/**
 * @version v1.0
 * @ClassName：Singleton
 * @Description:单例类
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();

        System.out.println(instance1 == instance);
    }
}
