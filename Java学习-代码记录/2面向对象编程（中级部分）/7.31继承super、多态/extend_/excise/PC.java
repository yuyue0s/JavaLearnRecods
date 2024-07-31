package com.study.extend_.excise;

public class PC extends Computer{
    private String brand;
    public PC(String cpu, String memory, String disk,String brand){
        super( cpu,  memory,  disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo() {
        System.out.print("PC信息= ");
        System.out.println(getDetails() + " brand=" + brand);
    }
}
