import java.util.Scanner;

public class Exercise{
    //题目在7.15分支练习word
    public static void main(String[]args){
        //题目1：声明2个 double 型变量并赋值。
        //判断第一个数大于 10.0，且第2个数小于 20.0，打印两数之和。
        double num1 = 12.1;
        double num2 = 15.7;
        if (num1 > 10.0 && num2 < 20.0){
            System.out.println("两数之和=" + (num1 + num2));

        //题目2：定义两个变量int，判断二者的和，是否能被3又能被5整除，打印提示信息
        int num3 = 5;
        int num4 = 10;
        int num5 = num3 + num4;
        if (num5%3 == 0 && num5%5 == 0){
            System.out.println("该数既能被3又能被5整除");
        }else {
            System.out.println("该数不能被3又能被5整除");
        }

        //题目3：判断一个年份是否是闰年
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年份判断是否是闰年");
        int years = myScanner.nextInt();
        if ((years%4 == 0 && years%100 != 0) || years%400 == 0){
            System.out.println(years + "是闰年");
        }else{
            System.out.println(years + "不是闰年");
        }
        }
    }
}