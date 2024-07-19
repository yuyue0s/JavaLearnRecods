import java.util.Scanner;

public class CycleExercise01 {
    public static void main(String[]args){
        //练习3：
        //判断一个年份是否为闰年
        System.out.println("请输入一个年份，可以判断它是否是闰年");
        Scanner myScanner1 = new Scanner(System.in);
        int years = myScanner1.nextInt();
        if (years % 400 == 0 ||(years % 4 ==0 && years % 100 != 0)){
            System.out.println(years + "是闰年");
        }else System.out.println(years+"不是闰年");

        System.out.println("======================");
        //练习2：
        //实现判断一个整数，属于哪个范围:大于0;小于0;等于0.
        System.out.println("请输入一个整数");
        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();
        if (num > 0){
            System.out.println("该整数大于0");
        }else if (num < 0){
            System.out.println("该整数小于0");
        } else if (num == 0) {
            System.out.println("该整数等于0");
        }

        System.out.println("=========================");
        //练习1：   (cash:现金)
        //某人有100,000元,每经过一次路口，需要交费,规则如下:
        //1)当现金>50000时,每次交5%
        //2)当现金<=50000时,每次交1000
        //编程计算该人可以经过多少次路口(要求: 使用 while + break方式完成)
        double cash = 100000; //定义变量cash金钱
        int times = 0; //定义次数
        while(times < 999){
            if (cash > 50000){
                cash = (cash - (cash*0.05));
            }else if (cash <= 50000 && cash >= 1000) {
                cash = cash - 1000;
            }else if (cash < 1000){
                break;
            }
            times++;
        }
        System.out.println("总共可以经过"+times+"次路口");
    }
}
