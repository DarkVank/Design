package com.crocodile.principles.dip;
/**
 * @version v1.0
 * @ClassName：Computer
 * @Description:电脑
 * @Author：crocodilePole
 */
public class Computer {
      private HardDisk hardDisk;
      private Cpu cpu;
      private Memory memory;

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void run(){
        hardDisk.get();
        cpu.run();
        memory.save();
    }
}
