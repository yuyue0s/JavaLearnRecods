import java.util.Scanner;

public class MultiplyCycleExercise01 {
    public static void main(String[]args){
        //介绍：什么是多重循环？将一个循环放在另一个循环体内，就形成了嵌套循环。
        //其中，for ,while ,do…while 均可以作为外层循环和内层循环
        //请分析下面的多重循环执行步骤, 并写出输出
        for(int i = 0; i < 2; i++) {
            for( int j = 0; j < 3; j++) {
                System.out.println("i=" + i + "j=" + j);
            }
        }
        //嵌套循环就是把内层循环当成外层循环的循环体。当只有内层循环的循环条件为false时，
        //才会完全跳出内层循环，才可结束外层的当次循环，开始下一次的外层的循环

        //练习2：
        //打印出九九乘法表
        //思路分析：
        //i 和 j
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i + "*" + j + "=" + (i*j));
            }
        }

        //练习1；  (group:组  score;grade;mark:分数  order:顺序 number:数  average:平均)
        //统计3个班的成绩，每个班5名同学，求出各个班的平均分和所有班级的平均分（学生的成绩从键盘输入）
        //统计3个班的及格人数，每个班有5名同学
        //思路分析(化繁为简)
        //第一步：先计算一个班，5个学生的成绩
        Scanner myScanner = new Scanner(System.in);
        int pass = 0;
        double totalsum = 0;
        int classNum = 3;
        int studentNum = 5;
        for (int j = 1; j <=classNum ; j++) {//3个班
            double score = ' ';
            double sum = 0;
            for (int i = 1; i <= studentNum; i++) {//每个班的5名学生
                System.out.println("请输入"+j+"班第" + i + "个学生的成绩");
                score = myScanner.nextDouble();
                if (score>60){
                    pass++;
                }
                sum += score;
                System.out.println(j+"班"+"第" + i + "个学生的成绩是" + score);
            }
            totalsum += sum;
            System.out.println("总分是" + sum + "平均分是" + (sum / studentNum));
        }
        System.out.println("三个班及格人数是"+pass+"三个班的平均分是"+(totalsum/15)+"三个班的总分是"+(studentNum*classNum));

        System.out.println("==================================");

    }
}
