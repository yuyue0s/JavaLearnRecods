public class ForDetail {
        //for循环执行的细节
    public static void main(String[]args){
                /*基本语法：
        for (循环变量初始化;循环条件;循环变量迭代){
            循环操作(可以一条或多条语句);
        }*/
        //补充
//        for (;;){
//            System.out.println("你好加油");
//        }
        //这是一个无限循环 死循环


        //细节1：循环条件是返回一个布尔值的表达式
        //细节2: for (;循环条件;) 中的初始化变量和循环变量迭代可以写在其他地方，但是两边的分号不能省略
        //细节3：循环初始值可以有多条初始化语句，但要求类型一样并中间用逗号隔开。
        //循环变量迭代也可以有多条变量迭代语句，中间用逗号隔开。例如：
        int count = 3;
        int i = 0,j=0;
        for (;i < count;i++,j += 2){
            System.out.println(i + j);
        }
    }
}
