import java.util.Scanner;
public class BranchExercise01 {
    public static void main(String[]args){
        //多分支练习1：(信用的英文单词：credit 分数的英文单词：score grade)
        //题目：输入保国同志的芝麻信用分:(见7.15word文档)
        //如果:信用分为(80，99]时，输出 信用优秀:
        //信用分为[60,80]时，输出 信用一般:
        //其它情况 ，输出 信用不及格
        //请从键盘输入保国的芝麻信用分，并加以判断
        //修正：可以对输入的信用分进行一个范围有效判断（1-100），否则提示输入错误
        System.out.println("请输入您的信用分1-100");
        Scanner myScanner = new Scanner(System.in);
        int creditScore = myScanner.nextInt();
        if (creditScore >= 1 && creditScore <= 100) {
            if (creditScore == 100) {
                System.out.println("信用极好");
            } else if (80 < creditScore && creditScore <= 99) {//(写成80 < creditScore <= 99是错误的写法)
                System.out.println("信用优秀");
            } else if (60 < creditScore && creditScore <= 80) {
                System.out.println("信用一般");
            } else {
                System.out.println("信用不及格");
            }
        }else {
            System.out.println("信用分需要在1-100之间，请重新输入");
        }
        //思考：如果输入的不是整数 而是hello.. 这该怎么办？(后面会学到异常处理机制来解决)

        //看下面这段代码 看看输出什么？
        boolean b = true;
        if (b == false) System.out.println("a");
        else if (b) System.out.println("b");
        else if (!b) System.out.println("c");
        else System.out.println("d");//输出为b
        //如果把b == false 改为 b = false 会输出什么呢?
        boolean a = true;
        if (a = false) System.out.println("a");
        else if (a) System.out.println("b");
        else if (!a) System.out.println("c");
        else System.out.println("d");//输出为c
    }
}
