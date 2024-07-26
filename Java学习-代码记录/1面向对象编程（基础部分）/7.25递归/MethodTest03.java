public class MethodTest03 {
    public static void main(String[] args) {
        //3.在main方法中接受类1对象属性，在类2 方法中 修改该类1对象属性，
        //原来的main方法中接受的类1对象属性也会改变（因为创建对象又是一个地址）
        num1 n1 = new num1();
        n1.age = 10;
        n1.name = "小明";
        num2 n2 = new num2();
        n2.test(n1);
        System.out.println(n1.age);
    }
}
class num1{
    int age;
    String name;
}
class num2{
    public void test(num1 n){
        n.age = 1000;
    }
}
