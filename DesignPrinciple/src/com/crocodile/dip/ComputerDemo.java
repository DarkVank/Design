package com.crocodile.dip;

import com.crocodile.dip.impl.InterCpu;
import com.crocodile.dip.impl.KingstonMemory;
import com.crocodile.dip.impl.XiJieHardDisk;

/**
 * @version v1.0
 * @ClassName：ComputerDemo
 * @Description:测试类
 * @Author：crocodilePole
 */
public class ComputerDemo {

    public static void main(String[] args) {
        //组件
        HardDisk hardDisk = new XiJieHardDisk();
        Cpu cpu = new InterCpu();
        Memory memory = new KingstonMemory();

        //计算机
        Computer computer = new Computer();
        computer.setHardDisk(hardDisk);
        computer.setCpu(cpu);
        computer.setMemory(memory);

        //运行计算机
        computer.run();
    }
}
