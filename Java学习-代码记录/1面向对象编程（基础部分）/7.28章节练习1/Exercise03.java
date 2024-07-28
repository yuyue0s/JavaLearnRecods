public class Exercise03 {
    public static void main(String[] args) {
        //练习7：设计一个Dog类，有名字、颜色和年龄属性，定义输出方法show()显示其信息并创建对象，进行测试
        Dog test7 = new Dog("大黄","黄色",3);
        test7.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name = name;
        this.age = age;
        this.color = color;
    }
    public void show() {
        System.out.println(this.name + "是一只" + this.age + "岁的" + this.color + "狗");
    }
}
