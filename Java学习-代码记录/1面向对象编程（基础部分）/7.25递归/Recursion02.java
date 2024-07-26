public class Recursion02 {
    public static void main(String[] args) {
        //阶乘问题
        Y test = new Y();
        int res = test.factorial(5);
        System.out.println(res);
    }
}
class Y{
    public int factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return factorial(n -1) * n;
        }
    }
}
