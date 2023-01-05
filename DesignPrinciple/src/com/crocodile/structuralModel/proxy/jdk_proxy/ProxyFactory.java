package com.crocodile.structuralModel.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @version v1.0
 * @ClassName：TrainStation
 * @Description:代理工厂类
 * @Author：crocodilePole
 */
public class ProxyFactory {

    //声明目标对象
    private TrainStation station = new TrainStation();

    public SellTickets getProxyObject(){

        //声明代理对象
//        ClassLoader loader:类加载器，通过目标对象获取
//        Class<?>[] interfaces：代理类实现的接口的字节码
//        InvocationHandler h：代理对象调用处理程序

        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                station.getClass().getClassLoader(),
                station.getClass().getInterfaces(),
                new InvocationHandler() {
                    //object proxy: 代理对象，等同于proxyObject
                    //Method method:对代理对象实现接口的方法进行封装的method对象
                    //object[] args:盗用方法传递的实际参数
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke 执行");
                        Object obj = method.invoke(station, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
