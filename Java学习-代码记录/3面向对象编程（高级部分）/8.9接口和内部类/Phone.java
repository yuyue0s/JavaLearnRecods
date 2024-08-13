package com.study.interface_;

public class Phone implements UsbInterface{
    @Override
    public void start() {
        System.out.println("Phone 开始");
    }

    @Override
    public void stop() {
        System.out.println("Phone 结束");
    }
}
