public class This01 {
    public static void main(String[] args) {
        Bird b1 = new Bird("小飞",5);
        b1.print();
    }
}
class Bird{
    String name;
    int age;
//    public Bird(String bName,int bAge){
//        name = bName;
//        age = bAge;
//    }
    //如果我们构造器的形参，能够直接写成属性名，就更好了
    //但是出现了一个问题，根据变量的作用域原则(就近原则)
    //构造器的name 是局部变量，而不是属性
    //构造器的age 是局部变量，而不是属性
    //==> 引出this 关键字来解决
    public Bird(String name,int age){
        //this.name 就是当前对象的属性name
        this.name = name;
        //this.age 就是当前对象的属性age 当前对象就是指的谁在调用
        this.age = age;
    }
    public void print(){
        System.out.println(name + " "  + age);
    }
}
