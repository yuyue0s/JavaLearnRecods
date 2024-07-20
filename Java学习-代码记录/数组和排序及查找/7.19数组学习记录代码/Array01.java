import java.util.Scanner;
public class Array01 {
    public static void main(String[]args){
        //数组的使用---动态初始化2
        //1.先声明数组 语法:数据类型数组名[]; 也可以数据类型[] 数组名;
        double score[];//也可以写成 double[] score; 这个时候score是null 空的
        //2.创建数组 语法: 数组名=new 数据类型[大小];
        score = new double[5];

        //数组的使用---动态初始化1
        //数据类型 数组名[] = new 数据类型[大小]
        //练习1：循环输入5个成绩 保存到double数组 并且输出
        Scanner myScanner = new Scanner(System.in);
        double grade[] = new double[5];
        for (int i = 0; i < grade.length; i++) {
            System.out.println("请输入第"+(i + 1)+"个成绩");
            grade[i] = myScanner.nextDouble();
        }
        System.out.println("下面为输出的成绩");
        for (int i = 0; i < grade.length; i++) {
            System.out.println(grade[i]);
        }
    }
}
