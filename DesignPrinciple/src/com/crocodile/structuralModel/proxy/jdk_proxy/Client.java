package com.crocodile.structuralModel.proxy.jdk_proxy;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory();

        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

    }
}
