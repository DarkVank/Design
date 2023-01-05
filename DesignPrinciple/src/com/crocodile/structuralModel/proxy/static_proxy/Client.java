package com.crocodile.structuralModel.proxy.static_proxy;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
        ProxyPoint proxyPoint = new ProxyPoint();
        //买票
        proxyPoint.sell();
    }
}
