public class ConstructorDetail {
    public static void main(String[] args) {
        Cat c1 = new Cat("yy",10);//第一个构造器
        Cat c2 = new Cat("ii");//第二个构造器
    }
}
class Cat{
    String name;
    int age;
    //1）一个类可以定义多个不同的构造器，即构造器重载
    //第一个构造器
    public Cat(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    public Cat(String pName){
        name = pName;
    }
}