public class ThisDetail {
    public static void main(String[] args) {
        Pig p = new Pig("波哥");
        p.f2();
    }
}
class Pig{
    //1) this 关键字可以用来访问本类的属性、方法、构造器
    String name = "博哥";
    int age = 14;

    public void f1(){
        System.out.println("方法f1");
    }

    public void f2(){
        System.out.println("方法f2");
        f1();
        this.f1();//this 关键字可以用来访问本类方法
    }

    public Pig(int age){
        System.out.println("构造器1" + " " + age);
    }

    public Pig(String name){
        //访问构造器语法：this(参数列表); 注意只能在构造器中使用
        //(即只能在构造器中访问另外一个构造器, 必须放在第一条语句)
        this(10);
        System.out.println("构造器2" + " " + name); //波哥
        System.out.println("构造器2" + " " + this.name); //博哥
    }
}