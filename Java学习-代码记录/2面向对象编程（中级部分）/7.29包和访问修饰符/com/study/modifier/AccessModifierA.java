package com.study.modifier;
/**
 * java 提供四种访问控制修饰符号，用于控制方法和属性(成员变量)的访问权限（范围）:
 * 1) 公开级别:用public 修饰,对外公开
 * 2) 受保护级别:用protected 修饰,对子类和同一个包中的类公开
 * 3) 默认级别:没有修饰符号,向同一个包的类公开.
 * 4) 私有级别:用private 修饰,只有类本身可以访问,不对外公开.

   1.修饰符可以用来修饰类中的属性，成员方法以及类
   2.只有默认的和public才能修饰类!并且遵循上述访问权限的特点
   3.成员方法的访问规则和属性完全一样
*/
public class AccessModifierA {
    //四个属性,分别使用不同的访问修饰符来修饰
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;//默认
    private int n4 = 400;
    //同类
    public void print(){
        System.out.print(n1+" "+n2+" "+n3+" "+n4);
    }
}
