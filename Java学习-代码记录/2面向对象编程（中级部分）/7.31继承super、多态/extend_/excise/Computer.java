package com.study.extend_.excise;
/**
 * 编写Computer 类，包含CPU、内存、硬盘等属性，getDetails 方法用于返回 Computer 的详细信息
 * 编写PC 子类，继承Computer 类，添加特有属性【品牌brand】
 * 编写NotePad 子类，继承Computer 类，添加特有属性【color】
 * 编写Test 类，在main 方法中创建PC 和NotePad 对象，分别给对象中特有的属性赋值，以及从Computer类继承的
 * 属性赋值，并使用方法并打印输出信息
 */
public class Computer {
    private String cpu;
    private String memory;
    private String disk;

    public Computer(String cpu, String memory, String disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    //返回 Computer 的详细信息
    public String getDetails(){
        return " cpu=" + cpu +" memory=" + memory + " disk=" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }
}
