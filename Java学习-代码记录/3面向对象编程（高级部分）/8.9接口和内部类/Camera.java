package com.study.interface_;

public class Camera implements UsbInterface{
    @Override
    public void start() {
        System.out.println("camera 开始");
    }

    @Override
    public void stop() {
        System.out.println("camera 结束");
    }
}
