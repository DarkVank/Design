package com.crocodile.creatorModel.BuilderModol;
/**
 * @version v1.0
 * @ClassName：Director
 * @Description:指挥者
 * @Author：crocodilePole
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public Bike construct(){
        mBuilder.buildFrame();
        mBuilder.buildSeat();

        return mBuilder.createBike();
    }
}
