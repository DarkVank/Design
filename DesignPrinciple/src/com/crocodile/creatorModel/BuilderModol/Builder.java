package com.crocodile.creatorModel.BuilderModol;
/**
 * @version v1.0
 * @ClassName：Builder
 * @Description:建造者类（抽象）
 * @Author：crocodilePole
 */
public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();

    public abstract void buildSeat();

    public abstract Bike createBike();

}
