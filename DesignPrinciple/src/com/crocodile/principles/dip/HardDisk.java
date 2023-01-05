package com.crocodile.principles.dip;
/**
 * @version v1.0
 * @ClassName：HardDisk
 * @Description:硬盘
 * @Author：crocodilePole
 */
public interface HardDisk {

    public void save(String data);
    public String get();
}
