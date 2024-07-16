import java.util.Scanner;
public class SwitchDetail {
    public static void main(String[]args){
        //细节1：
        //表达式数据类型 应和case后的常数类型一致
        //或者是可以自动转化成可以比较的类型 比如输入的是字符 而常量是int
        //细节2：
        //switch(表达式)中的表达式的返回值必须是：byte short int char enum(枚举) String
        //细节3：
        //case子句中的值(位置)必须是常量(1，'a')或常量表达式，不能是变量
        //细节4：
        //default子句是可选的，当没有匹配的case时，执行default
        //如果没有default子句，当没有匹配的任何常量，则没有输出
        //细节5：
        //break语句用来在执行完一个case分支后使程序跳出switch语句块
        //如果没有写break，程序会执行到switch结尾 除非遇到break
        char a = 'a';
        switch(a){
            case 'a':
                System.out.println("ok1");
                //break;
            case 'b':
                System.out.println("ok2");
                break;
            default:
                System.out.println("ok3");
        }
        char b = 'b';
        switch(b){
            case 'a':
                System.out.println("ok1");
                //break;
            case 'b':
                System.out.println("ok2");
                //break;
            default:
                System.out.println("ok3");
        }
        //验证
        System.out.println("请输入学生的成绩(0-100)");
        Scanner myScanner1 = new Scanner(System.in);
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
    }
}
