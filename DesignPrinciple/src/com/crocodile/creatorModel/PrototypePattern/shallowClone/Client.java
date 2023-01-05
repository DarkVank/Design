package com.crocodile.creatorModel.PrototypePattern.shallowClone;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:Citation
 * @Author：crocodilePole
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation citation1 = citation.clone();
        citation.setName("张三");

        citation1.setName("李四");

        citation.show();

        citation1.show();
    }
}
