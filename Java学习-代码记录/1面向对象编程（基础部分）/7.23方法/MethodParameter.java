public class MethodParameter {
    public static void main(String[]args){
        A a = new A();
        a.name = "小米";
        a.age = 10;
        B b = new B();
        b.M1(a);
        System.out.println(a.name);

    }
}
class A{
    int age;
    String name;
}
class B{
    public void M1(A num){
        num.name = null;
    }
}
