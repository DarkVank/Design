package com.crocodile.structuralModel.proxy.static_proxy;
/**
 * @version v1.0
 * @ClassName：ProxyPoint
 * @Description:代理卖票类
 * @Author：crocodilePole
 */
public class ProxyPoint implements SellTickets{

    //依赖的真实卖票类
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取火车票售卖手续费");
        trainStation.sell();
    }
}
