package com.crocodile.principles.InterfaceIso;
/**
 * @version v1.0
 * @ClassName：waterproof
 * @Description:防水
 * @Author：crocodilePole
 */
public class SafetyDoor implements AntiTheft, Fireproof,Waterproof{
    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireproof() {
        System.out.println("防火");
    }

    @Override
    public void waterproof() {
        System.out.println("防水");
    }
}
