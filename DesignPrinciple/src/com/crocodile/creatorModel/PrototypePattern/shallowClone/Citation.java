package com.crocodile.creatorModel.PrototypePattern.shallowClone;
/**
 * @version v1.0
 * @ClassName：Citation
 * @Description:原型类
 * @Author：crocodilePole
 */
public class Citation implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citation{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {

        System.out.println("恭喜"+this.name+"获得三好学生奖状");
    }
}
