public class Y {
    public static void main(String [] args){
        int a = 10;
        int b = 77;
        int c = a>b ? a : b;
        double d = a>b ? a : b + 1;//这个也是成立的 因为满足int--->double自动转化
        //表达式1和表达式2 要为可以赋给接收变量的类型（或可以自动转化 或 强制转化）
        //int c = a>b ? 1.1 : 2.2; 这样是不行的 因为1.1和2.2是double类型
        //但是可以换成int c = a>b ? (int)1.1 : (int)2.2;来强制转化
        System.out.println(c);
        System.out.println(d);
    }
}
