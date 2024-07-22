public class PorpertiesDetail {
    //注意事项和细节说明
    //1) 属性的定义语法同变量，示例：访问修饰符 属性类型 属性名;
    //简单的介绍访问修饰符： 控制属性的访问范围
    //有四种访问修饰符public, proctected, 默认, private ,后面会详细介绍
    //2) 属性的定义类型可以为任意类型，包含基本类型或引用类型
    //3) 属性如果不赋值，有默认值，规则和数组一致:int 0，short 0, byte 0, long 0,
    //float 0.0,double 0.0，char \u0000，boolean false，String null
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{5,6,7}};
        MyTool a = new MyTool();
        a.tools(arr);
        a.tools(arr);
        a.tools(arr);
    }
    //基本介绍
    //1) 从概念或叫法上看： 成员变量 = 属性 = field(字段) （即成员变量是用来表示属性的，授课中，统一叫属性)
    //编写一个main 方法
}
    class Car {
    String name;//属性, 成员变量, 字段field
    double price;
    String color;
    String[] master;//属性可以是基本数据类型，也可以是引用类型(对象，数组)
    }
    //2) 属性是类的一个组成部分，一般是基本数据类型,也可是引用类型(对象，数组)。比如我们前面定义猫类的int age就是属性

