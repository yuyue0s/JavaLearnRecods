public class MethodOverLoad01 {
    public static void main(String[] args) {
        MyCalculator test1 = new MyCalculator();
        System.out.println(test1.calculate(1,2));
        System.out.println(test1.calculate(1,2.5));
        System.out.println(test1.calculate(1,2,4));
    }
}
class MyCalculator{
    //两个整数的和
    public int calculate(int n,int m){
        return n + m ;
    }
    //一个int，一个double 的和
    public double calculate(int n,double m){
        return n + m;
    }
    //一个整数double，一个int的和
    public double calculate(double n,int m){
        return n + m;
    }
    //三个int的和
    public int calculate(int n,int m,int j){
        return n + m + j;
    }
}