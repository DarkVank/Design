package com.crocodile.principles.opc;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试类：开闭原则（open close principle）
 *                     对扩展开放，对修改关闭
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
