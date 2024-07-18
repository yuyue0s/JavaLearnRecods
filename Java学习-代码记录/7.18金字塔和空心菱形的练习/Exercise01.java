import java.util.Scanner;

public class Exercise01 {
    public static void main(String[]args){
        //写一个从控制台接收整数参数，得到从零开始到该值的累加和
        //比如：控制台输入100，则得到0-100的累加和值
        //两种方式实现
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个数，可以得到从零开始到该值的累加和");
        int number1 = myScanner.nextInt();
        int sum1 = 0;
        int i = 0;
        while (i <= number1){
            sum1 += i;
            i++;
        }
        System.out.println("0到"+number1+"总和是"+sum1);

        System.out.println("===================");

        System.out.println("请输入一个数，可以得到从零开始到该值的累加和");
        int number2 = myScanner.nextInt();
        int sum2 = 0;
        int j = 0;
        for (;j<=number2;j++){
            sum2 += j;
        }
        System.out.println("0到"+number2+"总和是"+sum2);

        System.out.println("======================");

        System.out.println("请输入一个数，可以得到从零开始到该值的累加和");
        int number3 = myScanner.nextInt();
        int sum3 = 0;
        int k = 0;
        do {
            sum3 += k;
            k++;
        }while (k <= number3);
        System.out.println("0到"+number3+"总和是"+sum3);
    }
}
