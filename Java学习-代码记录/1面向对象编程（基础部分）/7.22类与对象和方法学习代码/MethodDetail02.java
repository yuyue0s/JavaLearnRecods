public class MethodDetail02 {
    public static void main(String[]args){
        //方法调用细节说明：
        //细节1：同一个类中的方法调用:直接调用即可。比如 print(参数);案例演示:B类 sayOk 调用 print()
        //细节2：跨类中的方法A类调用B类方法:需要通过对象名调用。比如 对象名.方法名(参数); 案例演示:C类 sayHello 调用 print()
        B b = new B();
        b.sayOK();
        C a = new C();
        a.sayHello();
    }
}
class B{
    public void print(){
        System.out.println("print");
    }
    public void sayOK(){
        print();
        System.out.println("sayOK");
    }
}
class C{
    public void sayHello(){
        B a = new B();
        a.sayOK();
        System.out.println("sayHello");
    }
}