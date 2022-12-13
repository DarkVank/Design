package com.crocodile.dip.impl;

import com.crocodile.dip.HardDisk;
/**
 * @version v1.0
 * @ClassName：HardDisk
 * @Description:希尔硬盘
 * @Author：crocodilePole
 */
public class XiJieHardDisk implements HardDisk {
    @Override
    public void save(String data) {
        System.out.println("使用希尔硬盘存储数据：" + data);
    }

    @Override
    public String get() {

        System.out.println("获取希尔硬盘中的数据");
        return "数据";
    }
}
