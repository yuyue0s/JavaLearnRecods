public class ex {
    public static void main (String[] args){
        //实现三个数的最大值
        int a = 5;
        int b = 9;
        int c = 3;
        int d = a>b ? a : b;
        int e = d>c ? d : c;
        System.out.println(e);
        //使用一条语句来实现
        int f = (a>b ? a : b)>c ? a>b ? a : b : c;
        System.out.println(f);
    }
}
