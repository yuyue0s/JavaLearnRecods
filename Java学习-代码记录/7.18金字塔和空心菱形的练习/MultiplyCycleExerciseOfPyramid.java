import java.util.Scanner;

public class MultiplyCycleExerciseOfPyramid {
    public static void main(String[]args){
        //空心金字塔练习 见wor7.18
        //使用for 循环完成下面的案例
        //请编写一个程序，可以接收一个整数,表示层数（totalLevel），打印出金字塔。
        //思路分析（化繁为简）; 先死后活(改常量为变量)
        /*
        第一步：先打印一个矩形
        *****
        *****
        *****
        *****
        *****
        第二步：打印半个金字塔
        *      //第1层1个*
        **     //第2层2个*
        ***    //第3层3个*
        ****   //第4层4个*
        *****  //第5层5个*
        第三步：打印整个金字塔
        *      //第1层1个*  ---2*层数-1  ---前面有(层数-1)个空格
       ***     //第2层3个*
      *****    //第3层5个*
     *******   //第4层7个*
    *********  //第5层9个*
        第四步：打印空心金字塔
        *      //第1层1个* --- 中间0个空格 ---2*层数-1  ---前面有(层数-1)个空格
       * *     //第2层2个* --- 中间1个空格 ---2*层数-3个空格
      *   *    //第3层2个* --- 中间2个空格
     *     *   //第4层2个* --- 中间5个空格
    *********  //第5层9个* --- 中间0个空格
        第五步：先死后活
            把层数做成一个变量 storey：楼层
        */
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输出金字塔的层数");
        int storey = myScanner.nextInt();
        for (int i = 1; i <=storey ; i++) { //i表示层数
            //在输出*之前 先输出 对应的空格=层数-1
            for (int j = 1; j <= (storey-i) ; j++) {
                //System.out.print("\s");这两都可以表示空格
                System.out.print(" ");
            }
            //控制打印每层*的个数
                for (int j = 1; j <= (i*2-1) ; j++) {
                    if (j==1 || j==(i*2-1) || i==storey) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            //每打完一层*后 就要换行
                //System.out.println("\n"); 这两都可以表示换行
                System.out.println("");
        }
    }
}

