package com.crocodile.creatorModel.PrototypePattern.deepClone;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName：Citation
 * @Description:原型类
 * @Author：crocodilePole
 */
public class Citation implements Cloneable, Serializable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {

        System.out.println("恭喜"+this.student.getName()+"获得三好学生奖状");
    }
}
