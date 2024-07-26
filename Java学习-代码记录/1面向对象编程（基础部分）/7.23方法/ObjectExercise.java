public class ObjectExercise {
    public static void main(String[]args){
        PersonOne zSan = new PersonOne();
        zSan.age = 18;
        zSan.gender = "男";
        zSan.name = "张三";
        System.out.println(zSan.age + zSan.name + zSan.gender);
        zSan.introduce();
        zSan.eat();
    }
}
//练习1：
//属性：名字，性别，年龄
//方法：（1）自我介绍的方法（2）吃饭的方法
//创建一个对象“张三”
class PersonOne{ //Person1是类
    int age;
    String gender;
    String name;

    //编写方法的思路
    //1. 方法的返回类型 2. 方法的名字 3. 方法的形参 4. 方法体
    public void introduce(){
        System.out.println("自我介绍");
    }
    public void eat(){
        System.out.println("吃饭");
    }
}