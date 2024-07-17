public class ForExercise01 {
    public static void main(String[]args){
        /*基本语法：
        for (循环变量初始化;循环条件;循环变量迭代){
            循环操作(可以一条或多条语句);
        }*/
        //练习2：题目见word7.17文档
        //化繁为简
        //(1)输出0-5 输出5-0
        //(2)两个相加
        //先死后活
        //把常量变为变量
        int s = 0;
        int e = 5;
        for (int num1 = s;num1 <= e;num1++){
            System.out.println(num1 + "+" + (e-num1) + "=" + e);
        }


        //练习1：打印1-100之间所有是9的倍数的整数，统计个数和总和
        //两个技巧：化繁为简 先死后活
        //化繁为简
        //(1)完成1-100的输出
        //(2)对1-100筛选过滤 只输出9的倍数
        //(3)统计个数 定义一个变量count = 0 ，满足条件的时候 count++;
        //(4)统计总和 定义一个变量sum = 0 , 满足条件的时候 sum = sum + a;
        //先死后活
        //(1)为了适应更好的需求，把范围的开始的值和结束的值，做出变量
        //(2)1-100的开始和结束，包括倍数也可以做出变量
        //打印start-end之间所有是multiple的倍数的整数，统计个数和总和
        int count = 0;
        int sum = 0;
        int start = 1;
        int end = 100;
        int multiple = 9;
        for (int num = start;num <= end;num++){
            if (num % multiple ==0 ){
                System.out.println(num);
                count++;
                sum += num;
            }
        }
        System.out.println(count);
        System.out.println(sum);

        //例题：编写一个程序，可以打印10句"hello，TanYu"
        for (int i = 1;i <= 10;i++){
            System.out.println("hello,TanYu" + i);
        }
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
//        System.out.println("hello,TanYu");
    }
}
