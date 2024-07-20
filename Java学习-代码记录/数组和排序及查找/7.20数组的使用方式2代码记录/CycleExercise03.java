public class CycleExercise03 {
    public static void main(String[]args){
        //练习8.
        //求出1 - 1/2 + 1/3 - 1/4 ..... 1/100的和
        //可以先求1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6
        double sum = 0;
        for (double i = 1; i <= 100 ; i++) {
            double num = 1/(i+0);
            if (i % 2 == 0){
                sum -= num;
            }else sum += num;
        }
        System.out.println();
        System.out.println(sum);

        System.out.println("==================");
        //练习9.
        //求1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+..+100)的结果
        //第一步：先求出括号里面的数字;
        //第二步：全部加起来
        int sum1 = 0;
        for(int j = 1;j <= 100;j++) {
            for (int i = 1; i <= j; i++) {
                sum1 += i;
            }
        }
        System.out.println(sum1);
    }
}
