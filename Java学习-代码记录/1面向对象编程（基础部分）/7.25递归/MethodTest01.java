public class MethodTest01 {
    public static void main(String[]args){
        //1.基本数据类型传递的是值（拷贝），形参的任何改变不影响实参
        int a = 5;
        int b = 6;
        A test = new A();
        test.exchange(a,b);
        System.out.print(a);
        System.out.print(b);
    }
}
class A{
    public void exchange(int n,int m){
        int temp = 0;
        temp = n;
        n = m;
        m = temp;
        System.out.print(n);
        System.out.println(m);
    }
}
