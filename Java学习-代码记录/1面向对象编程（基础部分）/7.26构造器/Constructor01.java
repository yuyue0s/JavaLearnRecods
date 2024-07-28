public class Constructor01 {
    //构造方法又叫构造器(constructor)，是类的一种特殊的方法，它的主要作用是完成对新对象的初始化。它有几个特点：
    //1) 方法名和类名相同
    //2) 没有返回值
    //3) 在创建对象时，系统会自动的调用该类的构造器完成对象的初始化。
    public static void main(String[] args) {
        Person p1 = new Person("悦总",18);
        System.out.println(p1.name);
        System.out.println(p1.age);
    }
}
//构造器
//[修饰符] 方法名(形参列表){
//方法体;
//}
class Person{
    String name;
    int age;
//说明:
//1) 构造器的修饰符可以默认， 也可以是public protected private
//2) 构造器没有返回值
//3) 方法名和类名字必须一样
//4) 参数列表和成员方法一样的规则
//5) 构造器的调用, 由系统完成
    public Person(String pName,int pAge){
        name = pName;
        age = pAge;
    }
}
