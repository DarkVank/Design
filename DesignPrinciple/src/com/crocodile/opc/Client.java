package com.crocodile.opc;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试类
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
        SouGouInput souGouInput = new SouGouInput();

        DefaultSkin skin = new DefaultSkin();
        souGouInput.setSkin(skin);

        souGouInput.display();
    }
}
