public class WhileExercise {
    public static void main(String[]args){
        //用while输出十句你好谭宇
        //1) 循环条件 是返回一个布尔值的表达式
        //2) while 循环是 先判断 再执行语句
        int i = 1;   //循环变量初始化
        while(i <= 10){   //循环条件
            System.out.println("你好谭宇" + i);
            i++;//循环变量迭代(不能缺少 不然就无线循环了)
        }
            System.out.println("结束while");

        System.out.println("======================");
        //练习1：使用while打印1-100之间所有能被3整除的数
        //化繁为简;
        //(1)先打印1-100 (2)过滤1-100之间能被3整除的数
        int num1 = 1; //初始化变量
        while (num1 <= 100){
            if (num1%3 == 0) {
                System.out.println(num1);
            }
            num1++; //循环变量迭代，变量自增
        }

        System.out.println("====================");
        //练习2：使用while打印40-200之间所有的偶数
        int num2 = 40;
        while(num2 <= 200){
            if (num2%2 == 0){ //偶数就是取模2为0
                System.out.println(num2);
            }
            num2++;
        }
    }
}
