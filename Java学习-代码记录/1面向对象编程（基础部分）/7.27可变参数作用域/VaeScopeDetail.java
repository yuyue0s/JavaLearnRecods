public class VaeScopeDetail {
    public static void main(String[] args) {
        Person test1 = new Person();
        test1.say();
    }
}
//1）属性和局部变量可以重名，访问时遵循就行原则
//2）在同一个作用域中，不可以重名。比如在同一个成员方法中，两个局部变量，不可以重名
//3）属性生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁。
//4）局部变量生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁，即在一次方法调用过程中。
class Person{
    //全局变量/属性前面可以加修饰符
    //局部变量前面不可以加修饰符（public protected private）
    public String name = "小t";
    public void say(){
        String name = "小明";
        System.out.println(name);//输出小明
    }
}
