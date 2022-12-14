package com.crocodile.principles.lsp;
/**
 * @version v1.0
 * @ClassName：Rectangle
 * @Description:长方形
 * @Author：crocodilePole
 */
public class Rectangle implements Quadrilateral {
    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getLength() {
        return length;
    }

    @Override
    public double getWidth() {
        return width;
    }
}
