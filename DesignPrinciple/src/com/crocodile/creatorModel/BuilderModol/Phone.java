package com.crocodile.creatorModel.BuilderModol;

/**
 * @version v1.0
 * @ClassName：Demo
 * @Description:实验：构造参数过多，使用建造者模式进行重构
 * @Author：crocodilePole
 */
public class Phone {
    private String cpu;
    private String mainboard;
    private String memory;
    private String screen;

    private Phone(Builder builder){//建造者，赋值到产品类属性
        this.cpu = builder.cpu;
        this.mainboard = builder.mainboard;
        this.memory = builder.memory;
        this.screen = builder.screen;
    }


    public static final class Builder{
        private String cpu;
        private String mainboard;
        private String memory;
        private String screen;

        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }
        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }
        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }
        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Phone build(){
            return new Phone(this);
        }
    }

    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", mainboard='" + mainboard + '\'' +
                ", memory='" + memory + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
