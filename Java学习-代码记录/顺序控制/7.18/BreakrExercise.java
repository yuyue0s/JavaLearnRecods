import java.util.Scanner;

public class BreakrExercise {
    public static void main(String[]args){
        //break 快速入门：
        for (int i = 1; i < 10 ; i++) {
            if (i == 3){
                break;
            }
            System.out.println(i);
        }

        System.out.println("======================");
        //break练习1： 1-100以内的数求和，求出当和第一次大于20的当前数[for + break]
        int sum = 0; //累计和
        //注意i的作用范围 也可以把int i = 1;放在for循环外部
        int num1 = 0;
        for (int i = 1; i <= 100 ; i++) { //循环1-100
            sum += i;
            num1 = i;
            if (sum > 20){
                System.out.println("和>20的时候当前数为"+i);
                break;
            }
        }
        System.out.println("当和第一次大于20的当前数为" + num1);

        System.out.println("==============================");
        //break练习2：
        //实现登录验证，有3次机会，如果用户名为"谭宇" ,密码"666"提示登录成功，
        //否则提示还有几次机会，请使用for+break完成
        Scanner myScanner = new Scanner(System.in);
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("请输入用户名");
            String user = myScanner.next();
            System.out.println("请输入密码");
            String password = myScanner.next();
            //比较输入的名字和密码是否正确
            //String中有一个equals用法 是用来对 字符串的内容比较
            //在这里这是错误的写法：user == "谭宇" && password == "666"
            if ("谭宇".equals(user) && "666".equals(password)){
                System.out.println("登陆成功");
                break;
            }else {
                System.out.println("用户名或密码错误");
                System.out.println("您还剩下"+(3-i)+"次机会");
            }
        }
        System.out.println("for程序结束");
    }
}
