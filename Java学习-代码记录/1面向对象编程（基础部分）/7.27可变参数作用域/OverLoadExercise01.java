public class OverLoadExercise01 {
    //编写程序，类Methods中定义三个重载方法并调用。方法名为m。三个方法分别接收一个int参数、两个int参数、一个字符串参数。
    //分别执行平方运算并输出结果，相乘并输出结果，输出字符串信息。在主类的main()方法中分别用参数区别调用三个方法

    //在Methods类，定义三个重载方法max()，第一个方法，返回两个int值中的最大值，
    //第二个方法，返回两个double值中的最大值，第三个方法，返回三个double值中的最大值，并分别调用三个方法。
    public static void main(String[] args) {
        Methods test1 = new Methods();
        test1.m(2);
        test1.m(2,3);
        test1.m("你好");

        Methods test2 = new Methods();
        System.out.println(test2.max(3,4));
        System.out.println(test2.max(4.5,7.8));
        System.out.println(test2.max(5.6,0.8,3));//int 自动转化

    }
}
class Methods{
    public int max(int n,int m){
        return n > m ? n : m; // 三元运算符
    }

    public double max(double n,double m){
        return n > m ? n : m;
    }

    public double max(double n,double m,double j){
        double max1 = n > m ? n : m;
        return max1 > j ? max1 : j;
    }
    public void m(int n){
        System.out.println(n * n);
    }

    public void m(int n, int m){
        System.out.println(n * m);
    }

    public void m(String n){
        System.out.println(n);
    }
}
