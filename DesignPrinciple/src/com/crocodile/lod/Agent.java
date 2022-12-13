package com.crocodile.lod;
//Law of Demeter

/**
 * @version v1.0
 * @ClassName：Agent
 * @Description:经纪人
 * @Author：crocodilePole
 */
public class Agent {
    private Star star;
    private Fans fans;
    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting(){
        System.out.println(star.getName() + "与"+fans.getName()+ "粉丝线下活动见面");
    }
    public void business(){
        System.out.println(star.getName() + "与"+company.getName()+ "公司商谈");
    }
}
