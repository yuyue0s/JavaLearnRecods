//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Person t = new Person();
        t.name = "小t";
        t.age = 20;
        Person t1;
        t1 = t;
        t1.age = 10;
        System.out.println(t.age); //10

        int a = 10;
        int b;
        b = a;
        b = 80;
        System.out.println(a); //10

        //Java 内存的结构分析
        //1) 栈： 一般存放基本数据类型(局部变量)
        //2) 堆： 存放对象(Cat cat , 数组等)
        //3) 方法区：常量池(常量，比如字符串)， 类加载信息
        //4) 示意图[Cat (name, age, price)]

        //Java 创建对象的流程简单分析
        //Person p = new Person();
        //p.name = “jack”;
        //p.age = 10
        //1) 先加载Person 类信息(属性和方法信息, 只会加载一次)
        //2) 在堆中分配空间, 进行默认初始化(看规则)
        //3) 把地址赋给p , p 就指向对象
        //4) 进行指定初始化， 比如p.name =”jack” p.age = 10
    }
}
class Person{
    String name;
    int age;
}