import java.util.Scanner;

public class CycleExercise02 {
    public static void main(String[]args){
        //练习4：
        //判断一个整数是否是水仙花数，
        //所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
        //例如:153=1*1*1+3*3*3+5*5*5
        System.out.println("请输入一个整数来判断它是否是水仙花数字");
        Scanner myScanner = new Scanner(System.in);
        int number = myScanner.nextInt();
        if (number > 100 && number < 1000){
            //a表示个位 b表示十位 c表示百位
            int a = number%100%10;
            int b = number%100/10;
            int c = number/100;
            if (number == ( a*a*a + b*b*b + c*c*c ) ){
                //a的三次方a^3这样写是错误的 应该a*a*a
                System.out.println(number+"是一个水仙花数");
            }else System.out.println(number+"不是水仙花数");
        }else System.out.println(number+"不是水仙花数，提示：水仙花数是一个三位数的整数");

        System.out.println("========================");
        //练习6.
        //输出1-100之间的不能被5整除的数，每5个一行
        int line = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 5 != 0){
                System.out.print(i);
                System.out.print(" ");// \t制表位 对齐看起来看清晰
                line++;
                if (line % 5 == 0){
                    System.out.println("");
                }
            }
        }

        System.out.println("=================");

    }
}
