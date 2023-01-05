package com.crocodile.creatorModel.BuilderModol;
/**
 * @version v1.0
 * @ClassName：MoBikeBuilder
 * @Description:mo自行车建造类
 * @Author：crocodilePole
 */
public class MoBikeBuilder extends Builder{

    @Override
    public void buildFrame() {
        mBike.setFrame("mo车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("mo车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
