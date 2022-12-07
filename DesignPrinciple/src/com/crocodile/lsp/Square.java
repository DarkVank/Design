package com.crocodile.lsp;
/**
 * @version v1.0
 * @ClassName：Square
 * @Description:正方形
 * @Author：crocodilePole
 */
public class Square implements Quadrilateral{
//    边长
    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getLength() {
        return side;
    }

    @Override
    public double getWidth() {
        return side;
    }
}
