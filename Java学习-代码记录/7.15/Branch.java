import java.util.Scanner;
public class Branch {
    public static void main(String[]args){
        //输入人的年龄 如果该人年龄大于18岁
        //则输出"你的年龄大于18岁，要对自己的行为负责"
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入你的年龄");
        int age = myScanner.nextInt();
        if (age > 18){
            System.out.println("你的年龄大于18岁，要对自己的行为负责");
        }else {
            System.out.println("你的年龄不大 这次放过你了");
        }
        System.out.println("结束");
    }
}
