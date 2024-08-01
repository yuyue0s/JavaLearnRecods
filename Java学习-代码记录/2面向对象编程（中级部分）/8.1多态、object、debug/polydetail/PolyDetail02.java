package com.study.polymorphic.polydetail;

public class PolyDetail02 {
    public static void main(String[] args) {
        //instanceOf 比较操作符，用于判断对象的 运行类型 是否为 XX类型 或 XX类型的子类型
        //aa 的编译类型是AA，操作类型是BB
        AA aa = new BB();
        System.out.println(aa instanceof AA);
        System.out.println(aa instanceof BB);
    }
}
class AA{} //父类
class BB extends AA {} //子类