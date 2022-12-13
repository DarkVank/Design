package com.crocodile.dip.impl;

import com.crocodile.dip.Cpu;
/**
 * @version v1.0
 * @ClassName：InterCpu
 * @Description:inter处理器
 * @Author：crocodilePole
 */
public class InterCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用interCpu处理数据");
    }
}
