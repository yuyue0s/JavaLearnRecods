import java.util.Scanner;
//学习：基本语法快速入门学习细节灵活运用
public class SwitchExercise01 {
    public static void main(String[]args){
        //题目:(7.16word 符号 字母：character)
        //1.使用switch把小写类型的char型转为大写（键盘输入）。只转a,b,c,d,e。其他的输出"other"
        System.out.println("请输入字母abcde中的一个");
        Scanner myScannenr = new Scanner(System.in);
        char character2 = myScannenr.next().charAt(0);
        switch (character2){
            case 'a':
                System.out.println('A');
                break;
            case 'b':
                System.out.println('B');
                break;
            case 'c':
                System.out.println('C');
                break;
            case 'd':
                System.out.println('D');
                break;
            case 'e':
                System.out.println('E');
                break;
            default:
                System.out.println("other");
        }
        //2.对学生成绩大于60分的，输出"合格"。低于60分的输出"不合格"。（输入的成绩不能大于100）提示： 成绩/60
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("请输入学生的成绩(0-100)");
        int score = myScanner1.nextInt();
        if (score >=0 && score <=100){
            switch (score/60){
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
            }
        }else System.out.println("成绩输入有误");
        //解析：
        //我们可以进行一个转化 如果成绩在[60,100]，(int)(score/60)
        //如果成绩在[0,60)(int)(score/60)   成绩是一个double
        /*
        Scanner myScanner1 = new Scanner(System.in);
        System.out.println("请输入学生的成绩(0-100)");
        double score = myScanner1.nextDouble();
        if (score >=0 && score <=100){
            switch ((int)(score/60)){
                case 1:
                    System.out.println("合格");
                    break;
                case 0:
                    System.out.println("不合格");
                    break;
            }
        }else System.out.println("成绩输入有误");
        */

        //3.根据用于指定月份，打印该月份所属季节。345春季678夏季91011秋季1212冬季（提示：使用穿透）
        Scanner myScanner2 = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = myScanner2.nextInt();
        switch(month){
            case 1:
            case 2:
            case 12:
                System.out.println("冬季");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("春季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("春季");
                break;
            default:
                System.out.println("你输入的月份不对");
        }

        //题目4：请编写一个程序，该程序可以接受一个字符(7.16word)
        //比如a b c d e f.. a表示星期一 ，b表示星期二……
        //根据用户的输入显示相应的信息。要求使用switch语句完成
        System.out.println("请输入一个字符");
        Scanner myScanner = new Scanner(System.in);
        char character1 = myScanner.next().charAt(0);
        //在Java中 只有有值返回 就是一个表达式
        switch (character1){
            case 'a':
                System.out.println("星期一");
                break;
            case 'b':
                System.out.println("星期二");
                break;
            default:
                System.out.println("无 没有匹配");
                break;
        }
        System.out.println("退出了switch 继续执行程序");
    }
}
