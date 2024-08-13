package com.study.interface_;

public class Interface01 {
    public static void main(String[] args) {
        Phone phone = new Phone();
        Camera camera = new Camera();
        Computer.work(phone);
        System.out.println("======");
        Computer.work(camera);
    }
}
