package com.crocodile.structuralModel.proxy.jdk_proxy;

/**
 * @version v1.0
 * @ClassName：TrainStation
 * @Description:真实卖票类
 * @Author：crocodilePole
 */
public class TrainStation implements SellTickets {

    @Override
    public void sell() {
        System.out.println("火车站卖票");
    }
}
