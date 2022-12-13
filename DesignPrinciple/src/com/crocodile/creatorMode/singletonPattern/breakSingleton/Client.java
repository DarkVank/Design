package com.crocodile.creatorMode.singletonPattern.breakSingleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @version v1.0
 * @ClassName：Client
 * @Description:
 *         破坏单例模式：序列化
 *                    反射
 * @Author：crocodilePole
 */
public class Client {

    public static void main(String[] args) throws Exception{
//       writeObject2File();

       //反序列化：两次读取的对象存储的地址值不同，破坏了单例模式
//       readObject();
//       readObject();
        System.out.println("===================================");
        //反射
       getSingletonFromReflect();
       getSingletonFromReflect();

    }

    //反射
    public static void getSingletonFromReflect() throws Exception {
        Class clazz = Singleton.class;
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);//权限开启
        Singleton instance = (Singleton) constructor.newInstance();//通过构造方法创造实例

        System.out.println(instance);
    }


    //序列化对象
    public static void writeObject2File(){
        //获取对现象
        Singleton instance = Singleton.getInstance();
        //创建对象输出流对象 （采用try - resource）
        try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\else\\oneDrive\\桌面\\singleton.txt"))){
            oos.writeObject(instance);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //反序列化对象
    public static void readObject(){
        try(ObjectInputStream ois = new ObjectInputStream( new FileInputStream("E:\\else\\oneDrive\\桌面\\singleton.txt"))){
            Singleton readObject = (Singleton) ois.readObject();

            System.out.println(readObject);

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
