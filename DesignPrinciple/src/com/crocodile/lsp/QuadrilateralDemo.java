package com.crocodile.lsp;
/**
 * @version v1.0
 * @ClassName：QuadrilateralDemo
 * @Description:四边形测试类
 * @Author：crocodilePole
 */
public class QuadrilateralDemo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);

        printHeightAndW(rectangle);
        System.out.println("=======================");
        resize(rectangle);
        printHeightAndW(rectangle);
    }

    /**
     * 宽度增长
     * @param rectangle
     */
    public static void resize(Rectangle rectangle){

        while(rectangle.getWidth() <= rectangle.getLength()){
            rectangle.setWidth(rectangle.getWidth() + 1);
        }

    }

    public static void printHeightAndW(Quadrilateral quadrilateral){
        System.out.println("length:" + quadrilateral.getLength());
        System.out.println("width:" + quadrilateral.getWidth());
    }
}
