public class F1 {
    public static void main(String [] args){
//        int a = 3;
//        int b = 4;
//        int c = 5;
//        System.out.println(a == b);
//        System.out.println(a != b);
//        System.out.println(b == c);
//        System.out.println(b != c);
//
//        boolean x = a > b;
//        System.out.println(x);
//        boolean x = a > b;
//        boolean x1 = b >= a;
//        boolean x2 = x || x1;
//        boolean x3 = x && x1;
//        boolean x4 = x && x1 && x3;
//        boolean x5 = x || x1 || x3;
//        boolean x6 = x && x1 || x3;
//        boolean x7 = x || x2 && x3;
//        System.out.println(x);
//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.println(x3);
//        System.out.println(x4);
//        System.out.println(x5);
//        System.out.println(x6);
//        System.out.println(x7);

        int a = 1;
        int b = 2;
        int c = 0;

        boolean b1 = b != 0 && a/b > 0;
        boolean b2 = c != 0 && b/c > 0;
        if (b1 && b2){
            System.out.println("b1 && b2");
        }else{
            System.out.println("not b1 && b2");
        }
    }
}
