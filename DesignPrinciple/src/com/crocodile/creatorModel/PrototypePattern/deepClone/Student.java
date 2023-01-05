package com.crocodile.creatorModel.PrototypePattern.deepClone;

import java.io.Serializable;

/**
 * @version v1.0
 * @ClassName：Student
 * @Description:学生类
 * @Author：crocodilePole
 */
public  class Student implements Serializable {
    public String name;

    public String getName() {

        return name;
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
