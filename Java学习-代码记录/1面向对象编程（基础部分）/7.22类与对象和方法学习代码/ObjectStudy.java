public class ObjectStudy {
    public static void main(String[]args){
        //1) 类是抽象的，概念的，代表一类事物,比如人类,猫类.., 即它是数据类型.
        //2) 对象是具体的，实际的，代表一个具体事物, 即是实例.
        //3) 类是对象的模板，对象是类的一个个体，对应一个实例
        //张老太养了两只猫猫:一只名字叫小白,今年3 岁,白色。还有一只叫小花,今年100 岁,花色。请编写一个程序，
        //当用户输入小猫的名字时，就显示该猫的名字，年龄，颜色。如果用户输入的小猫名错误，则显示张老太没有这只猫猫。
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        System.out.println(cat1.name);

    }
}
class Cat{
    String name;//名字
    int age; //年龄
    String color; //颜色
    double weight; //体重
}
