package com.crocodile.principles.dip.impl;

import com.crocodile.principles.dip.Cpu;
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
