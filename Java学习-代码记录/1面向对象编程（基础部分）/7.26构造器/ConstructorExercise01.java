public class ConstructorExercise01 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog("小博",14);
        System.out.println(d1.age);
        System.out.println(d2.age + " " + d2.name);
    }
}
//练习：
//在定义的Dog 类中添加两个构造器：
//第一个无参构造器：利用构造器设置所有狗的age 属性初始值都为18
//第二个带dName 和dAge 两个参数的构造器：使得每次创建Dog 对象的同时初始化对象的age 属性值和name 属性值。
//分别使用不同的构造器，创建对象.
class Dog{
    int age;
    String name;
    public Dog(){
        age = 18;
    }
    public Dog(String dName, int dAge){
        name = dName;
        age = dAge;
    }
}