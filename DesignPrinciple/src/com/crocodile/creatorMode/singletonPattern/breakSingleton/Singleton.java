package com.crocodile.creatorMode.singletonPattern.breakSingleton;


import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName：Singleton
 * @Description:单例类
 * @Author：crocodilePole
 */
public class Singleton implements Serializable {
    private static boolean flag = false;
    private Singleton(){
      synchronized(Singleton.class){
          if(flag == false){
              throw new RuntimeException("不能创建多个对象");
          }
          flag = true;
      }
    }

    private static class SingletonHolder{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.INSTANCE;
    }

    public Object readResolve(){
        return SingletonHolder.INSTANCE;
    }
}
