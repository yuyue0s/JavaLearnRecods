public class Ex01 {
    public static void main(String[] args){
        System.out.println(10/4);//从数学中是2.5 Java中是2
        System.out.println(10.0/4);//Java中是2.5
        double a = 10/4;//Java中10/4=2，2=>2.0因为是double
        System.out.println(10 % 3);//1
        System.out.println(-10 % 3);//-1
        System.out.println(10 % -3);//1
        System.out.println(-10 % -3);//-1
        //在%（取模）看一个公式 a % b = a - a/b*b
        System.out.println(a);//2.0
    }
}
