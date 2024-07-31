package com.study.super_;
//super 代表父类的引用，用于访问父类的属性、方法、构造器
public class B extends A{

    //访问父类的属性，但不能访问父类的private属性
    public void hi() {
        System.out.println(super.n1 + super.n2 + super.n3);
    }
    //访问父类的方法，不能访问父类的private方法
    public void say() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();//private
    }
    //访问父类的构造器(这点前面用过):super(参数列表);只能放在构造器的第一句，只能出现一句。

    //当子类中有和父类中的成员(属性和方法)重名时，为了访问父类的成员，必须通过super。
    //如果没有重名使用super、this、直接访问是一样的效果!
    public void sum(){
        /**
         * //希望调用父类-A 的cal方法
         * //这时，因为子类B没有cal方法，因此我可以使用下面三种方式
         * //找cal方法时，顺序是:
         * //(1)先找本类，如果有，则调用
         * //(2)如果没有，则找父类(如果有，并可以调用，则调用)
         * //(3)如果父类没有，则继续找父类的父类,整个规则，就是一样的,直到 0bject类
         * 提示:如果查找方法的过程中，找到了，但是不能访问(比如private)，则报错
         * 如果查找方法的过程中，没有找到，则提示方法不存在
         */
        System.out.println(" sum B 子类");
        super.cal();
        cal(); //等价与this.cal();
        this.cal();
        this.cal2();
    }
    /**
     * super的访问不限于直接父类，如果爷爷类和本类中有同名的成员，也可以使用super去访问爷爷类的成员:
     * 如果多个基类(上级类)中都有同名的成员访问遵循就近原则。A->B->C，当然也需要遵守访问权限的相关规则
     */
    public void cal(){
        System.out.println(" cal B 子类");
    }
}
