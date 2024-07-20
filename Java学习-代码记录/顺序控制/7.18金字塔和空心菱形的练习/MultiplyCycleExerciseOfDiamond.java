import java.util.Scanner;

public class MultiplyCycleExerciseOfDiamond {
    public static void main(String[]args){
        //空心菱形练习 见wor7.18
        /*转化：
        变为空心的
        第一步：化繁为简 先打印一个5*10层的矩形
        一直转化 然后去把常量改为变量
        设置层数菱形 由于输入的可能是奇数或偶数 中间层数会有不同的变化 我这里用
        if设置了一个中间层数的变量 来进行纠正
        总结：第一次写这么多代码并且不断去优化 有成就感 但还要继续加快学习
         */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入菱形的层数");
        int storey = myScanner.nextInt();
        int middleStorey  =0;
        if (storey%2==0){
            middleStorey = (storey/2);
        }else {
            middleStorey = (storey/2)+1;
        }
        for (int i = 1; i <= storey ; i++) { //i为层数 i=1时 进入第一层为1个* i=10为1个* i=5时为5个*
            if (i <= middleStorey){
                for (int j = 1; j <=(middleStorey-i) ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (i*2-1); j++) {//j*i表示打几个*
                    if (j==1 || j==(i*2-1) ){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.println("");
            }else if (i > middleStorey){
                for (int j = 1; j <=(i-middleStorey) ; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= ((storey*2)-(i*2-1)); j++) {//j*i表示打几个*
                    if (j==1 || j==((storey*2)-(i*2-1)) ){
                        System.out.print("*");
                    }else System.out.print(" ");
                }
                System.out.println("");
            }
        }
        /* 解析：
            第一步：化繁为简 先打印一个5*10层的矩形
            转化：
            *
            **
            ***
            ****
            *****
            ******
            *******
            ********
            *********
            **********
            在转化成下面这样
            *     1
            **    2
            ***   3
            ****  4
            ***** 5
            ****  4   6--4
            ***   3   7--3
            **    2   8--2
            *     1   9--1
            转化：
            *     1   4空
           ***    2   3空
          *****   3   2空
         *******  4   1空
        ********* 5   0空 5--9 2*层数-1

         *******  4   1空 6--7   6--11  最高层*2-（层数*2-1）
          *****   3   2空 7--5   7--13
           ***    2   3空 8--3   8--15
            *     1   4空 9--1   9--17

         */
    }
}

