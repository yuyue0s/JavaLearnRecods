package com.study.interface_;

public class InterfacePolymorphic01 {
    //多态数组 -- 》 接口类型数组
    public static void main(String[] args) {
        Usb usb[] = new Usb[2];
        usb[0] = new Phone_();
        usb[1] = new Camera_();
        /*
        给Usb数组中，存放 Phone  和  相机对象，Phone类还有一个特有的方法call（），
        请遍历Usb数组，如果是Phone对象，除了调用Usb 接口定义的方法外，
        还需要调用Phone 特有方法 call
         */
        for (int i = 0; i < usb.length; i++){
            usb[i].work();
            if (usb[i] instanceof Phone_){
                //需要进行类型的向下转型
                ((Phone_) usb[i]).call();
            }
        }
    }
}
interface Usb {
    public abstract void work();
}
class Phone_ implements Usb {
    public void call() {
        System.out.println("Phone call");
    }

    @Override
    public void work() {
        System.out.println("Phone work");
    }
}
class Camera_ implements Usb{
    @Override
    public void work() {
        System.out.println("camera work");
    }
}