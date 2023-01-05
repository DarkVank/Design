package com.crocodile.creatorModel.BuilderModol;
/**
 * @version v1.0
 * @ClassName：Client
 * @Description:测试
 * @Author：crocodilePole
 */
public class Client {
    public static void main(String[] args) {
//        showBike(new MoBikeBuilder());

        showPhone();
    }

    public static void showPhone(){
        Phone phone = new Phone.Builder()
                .cpu("cpu")
                .memory("memory")
                .mainboard("111")
                .build();

        System.out.println(phone);
    }

    public static void showBike(Builder builder){
        Director director = new Director(builder);
        Bike bike = director.construct();

        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
