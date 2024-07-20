import java.util.Scanner;
public class DoWhileExercise {
    public static void main (String[]args){
        //do while的演示及练习
        //1.循环条件是返回一个布尔值的表达式
        //2.do..while循环是先执行 在判断 因此它至少执行一次
        //例题：用do while输出十句谭宇你好
        int num1 = 1;  //循环变量初始化
        do {
            System.out.println("谭宇你好" + num1); //循环体
            num1++; //循环变量迭代 如果没有将会陷入死循环
        }while(num1 <= 10);//循环条件
        System.out.println("退出dowhile循环 继续执行。。");

        System.out.println("==============================");
        //使用do while完成练习
        //练习4：如果李三不还钱，则小谭直接训斥五次，直到李三说还钱为止
        //[System.out.println("小谭问还钱吗？y/n")]
        //化繁为简
        //这是自己写的：(解析写在下面)
        Scanner myScanner = new Scanner(System.in);
        int j = 0;
        do {
            System.out.println("小谭问还钱吗?y/n");
            char answer = myScanner.next().charAt(0);
                if (answer == 'y'){
                    System.out.println("李三还钱了");
                    j++;
                }else if (answer == 'n'){
                    System.out.println("李三不还钱");
                }else System.out.println("请输入y或n");
        }while (j < 1);

        //解析：
//        Scanner myScanner = new Scanner(System.in);
//        char answer = ' ';
//        do {
//            System.out.println("训斥五次");
//            System.out.println("你还钱吗？y/n");
//            answer = myScanner.next().charAt(0);
//            System.out.println("他的回答是" + answer);
//        }while (answer != 'y');



        System.out.println("=======================");
        //使用do while完成练习
        //练习3：
        //统计1-200之间能被5整除但不能被3整除的个数
        //先死后活 0-200可以改变量
        int num4 = 1;
        int num5 = 0;//统计满足的个数
        do {
            if (num4%5 ==0 && num4%3 != 0){
                System.out.println(num4);
                num5++;
            }
            num4++;
        }while (num4<= 200);
        System.out.println("个数=" + num5);


        System.out.println("==============================");
        //使用do while完成练习
        //练习2：
        //计算1-100的和
        int num3 = 1;
        int sum1 = 0;
        do {
            sum1 += num3;
            num3++;
        }while (num3 <= 100);
        System.out.println("sunm1=" + sum1);
        System.out.println("========================");
        //使用do while完成练习
        //练习1：
        //打印1-100
        int num2 = 1;
        do {
            System.out.println(num2);
            num2++;
        }while (num2 <= 100);

    }
}
