package com.crocodile.principles.opc;
/**
 * @version v1.0
 * @ClassName：SouGouInput
 * @Description:输入法
 * @Author：crocodilePole
 */
public class SouGouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    //调用对象的皮肤展示
    public void display(){
       skin.display();
    }



}
