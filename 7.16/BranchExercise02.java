import java.util.Scanner;

public class BranchExercise02 {
    public static void main(String[]args){
        //嵌套练习1：(male男性female女性 man男人woman女人 gender性别)
        //参加歌手比赛，如果初赛成绩大于8.0进入决赛，否则提示淘汰。
        //并且根据性别提示进入男子组或女子组。输入成绩和性别，进行判断和输出信息
        //思路分析：1. 输入成绩>8.0的进入决赛 --> 2.输入性别进入男子组或女子组
        System.out.println("请输入你的初赛成绩");
        Scanner myScannner = new Scanner(System.in);
        double grade = myScannner.nextDouble();
        if (grade > 8.0){
            System.out.println("请输入你的性别男或女");
            char gender = myScannner.next().charAt(0);
            if (gender == '男'){
                System.out.println("你成功进入决赛，分配到男子组");
            }else if (gender == '女'){
                System.out.println("你成功进入决赛，分配到女子组");
            }else System.out.println("输入有误，请输入性别男或女");
        }else System.out.println("你已被淘汰，未进入决赛");

        //嵌套分支练习2：(月份：month)
        //出票系统：根据淡旺季节的月份和年龄，打印票价
        //4-10旺季：成人(18-60):60   儿童(<18):30    老人(>60):20
        //11-3淡季：成人：40 其他：20
        //分析：
        //第一步：先判断旺季(4-10月)还是淡季(11-3月)
        //第二步：在判断年龄来出票价
        System.out.println("请输入当前月份");
        Scanner myScanner = new Scanner(System.in);
        int month = myScannner.nextInt();
        if (month >= 4 && month <= 10){
            System.out.println("当前是旺季，请输入您的年龄来购票");
            int age1 = myScanner.nextInt();
            if (age1 >= 18 && age1 < 60){
                System.out.println("您的票价为60");
            } else if (age1 <18 && age1 > 0) {
                System.out.println("您的票价为30");
            }else if (age1 >= 60){
                System.out.println("您的票价为20");
            }else System.out.println("您的年龄输入有误，请重新输入");
        } else if ((month > 10 && month <=12) || (month < 4 && month > 0)) {
            System.out.println("当前是淡季，请输入您的年龄来购票");
            int age2 = myScanner.nextInt();
            if (age2 >= 18 && age2 < 60){
                System.out.println("您的票价为40");
            } else if ((age2 >= 60) || (age2 < 18 && age2 > 0)) {
                System.out.println("您的票价为20");
            } else System.out.println("您的年龄输入有误，请重新输入");
        }else System.out.println("您输入的月份有误，请输入1-12的月份");
    }
}
