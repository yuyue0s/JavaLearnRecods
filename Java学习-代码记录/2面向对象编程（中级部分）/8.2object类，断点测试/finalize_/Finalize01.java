package com.study.finalize_;

public class Finalize01 {
    public static void main(String[] args) {
        //当对象被回收时，系统自动调用该对象的finalize 方法。
        //子类可以重写该方法，做一些释放资源的操作
        /**
         * 什么时候被回收：当某个对象没有任何引用时，则jvm就认为这个对象是一个垃圾对象，
         * 就会使用垃圾回收机制来销毁该对象，在销毁该对象前，会先调用finalize 方法
         */
        Car xiaoMi = new Car("XiaoMi");
        xiaoMi = null;
        //将对象的引用置空 此时创建的新对象没有任何引用
        //这个时候xiaoMi就是一个垃圾 垃圾回收机制来销毁该对象，在销毁该对象前，会先调用finalize 方法。
        //程序员就可以在finalize 中，写自己的业务逻辑代码(比如释放资源：数据库连接,或者打开文件..)
        //如果程序员不重写finalize,那么就会调用Object 类的finalize, 即默认处理
        System.gc();//主动触发垃圾回收机制
        /**
         * 垃圾回收机制的调用，是由系统来决定(即有自己的GC 算法),
         * 也可以通过System.gc() 主动触发垃圾回收机制，测试：Car [name]
         */
        System.out.println("程序退出");
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    //重写finalize

    @Override
    protected void finalize() throws Throwable {
//默认调用父类        super.finalize();、
        System.out.println("hello");
    }
}