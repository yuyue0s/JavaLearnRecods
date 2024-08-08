package com.study.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Person tom = new Person("tom");
        //tom.totalFee(100);
        Person.totalFee(100);

        Person jack = new Person("jack");
        //jack.totalFee(200);
        Person.totalFee(200);

        Person.showFee();
    }
}
class Person{
    private String name;
    public Person(String name) {
        this.name = name;
    }
    //类变量 学费
    public static double fee = 0;
    //当方法使用了static修饰后 该方法就是静态方法
    //静态方法就可以访问静态属性/变量
    public static void totalFee(double fee) {
        Person.fee += fee;
    }
    //总共学费
    public static void showFee() {
        System.out.println(Person.fee);
    }
}