package com.study;

public class Single02 {
    //（1）构造器私有化
    //（2）定义一个static静态属性对象
    //（3）向外暴露一个静态的公共方法，可以返回一个对象
    //（4）懒汉式 只有当用户使用了方法时 才返回对象 当再次调用的时候 会返回上次创建的对象
    public static void main(String[] args) {
        System.out.println(BoyFriend.n1);
    }

}
class BoyFriend{
    public static int n1 = 100;
    private static String name;
    //私有化构造器
    private BoyFriend(String name) {
        System.out.println("被调用");
        this.name = name;
    }
    //创建静态对象属性
    private static BoyFriend yu;
    //创建公开的静方法
    public static BoyFriend one() {

        if (yu == null){ //如果yu对象为空
            yu = new BoyFriend("小宇");
        }
        return yu;
    }

    @Override
    public String toString() {
        return name;
    }
}