package com.crocodile.lod;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {

    public static void main(String[] args) {
        Star zlyStar = new Star("赵丽颖");
        Fans zThreeFans = new Fans("张三");
        Company jellyCompany = new Company("果冻媒体");
        //创建经纪人类
        Agent agent = new Agent();
        agent.setCompany(jellyCompany);
        agent.setFans(zThreeFans);
        agent.setStar(zlyStar);

        agent.meeting();
        agent.business();

    }
}
