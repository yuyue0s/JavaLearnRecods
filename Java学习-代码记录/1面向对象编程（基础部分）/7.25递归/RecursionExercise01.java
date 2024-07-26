public class RecursionExercise01 {
    public static void main(String[] args) {
        //练习2：猴子吃桃子问题:有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个!以后每天猴子都吃其中的一半，
        //然后再多吃一个。当到第10天时，想再吃时(即还没吃)发现只有1个桃子了。问题:最初共多少个桃子?
        //思路分析：
        //每天吃 总数/2 + 1个桃子 吃了9天 到第十条只有1个桃子
        //day10 1个桃子 (x+1)*2
        //day9 4个桃子 day9 = (day10 + 1)*2
        //day8 10个桃子 day8 = (day9 + 1)*2
        //今天的桃子 = （每天的桃子+1）*2
        calculate test2 = new calculate();
        int res2 = test2.num2(1);
        System.out.println(res2);

        //练习1：请使用递归的方式求出斐波那契数1,1,2,3,5,8,13...给你一个整数n，求出它的值是多少
        //num[x] = num[x-1] + num[x-2]
        calculate test1 = new calculate();
        int res1 = test1.num1(20);
        System.out.println(res1);

    }
}
class calculate{
    public int num2(int days){
        if (days == 10) {
            return 1;
        }else if (days >= 1 && days <= 9){
            return (num2(days+1)+1)*2;
        }else {
            System.out.println("输入错误");
            return -1;
        }
    }

    public int num1(int n){
        if (n < 3){
            return 1;
        }else {
            return num1(n-1) + num1(n-2);
        }
    }
}
