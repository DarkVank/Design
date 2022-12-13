package com.crocodile.creatorMode.singletonPattern.lazySingleton;
/**
 * @version v1.0
 * @ClassName：Singleton
 * @Description:单例类
 * @Author：crocodilePole
 */
public class Singleton {
    private Singleton(){}


     //问题：多线程访问问题
//     private static Singleton instance;
//    public static Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//
//        return instance;
//    }

//    private static Singleton instance;
//    //处理多线程访问问题，加锁：同一时间仅可由一个线程进入此方法
//    public static synchronized Singleton getInstance(){
//        if(instance == null){
//            instance = new Singleton();
//        }
//
//        return instance;
//    }

//    private static volatile Singleton instance;
//    //处理多线程访问问题，加锁：同一时间仅可由一个线程进入此方法
//    public static Singleton getInstance(){
//        if(instance == null){
//           synchronized (Singleton.class){
//               if(instance == null){
//                   instance = new Singleton();
//               }
//           }
//        }
//
//        return instance;
//    }



    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
