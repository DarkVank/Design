package com.crocodile.structuralModel.proxy.cglib_proxy;

import com.crocodile.structuralModel.proxy.jdk_proxy.SellTickets;

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

    public TrainStation getProxyObject(){

        return null;
    }
}
