package com.crocodile.InterfaceIso;
/**
 * @version v1.0
 * @ClassName：SafetyDoorDemo
 * @Description:测试
 * @Author：crocodilePole
 */
public class SafetyDoorDemo {
    public static void main(String[] args) {
        SafetyDoor safetyDoor = new SafetyDoor();
        safetyDoor.antiTheft();
        safetyDoor.fireproof();
        safetyDoor.waterproof();

        int x[][] = new int[3][2];


        String a[] = new String[5];
        for(int i = 0 ; i < a.length ; i++){
            System.out.println(1);
            System.out.println(a[i]);
        }
        System.out.println(x.length+" kkkk"+x[0].length);

    }
}
