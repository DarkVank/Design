package com.crocodile.principles.dip.impl;

import com.crocodile.principles.dip.Memory;
/**
 * @version v1.0
 * @ClassName：KingstonMemory
 * @Description:金士顿内存条
 * @Author：crocodilePole
 */
public class KingstonMemory implements Memory {
    @Override
    public void save() {
        System.out.println("使用金士顿内存条存储数据");
    }
}
