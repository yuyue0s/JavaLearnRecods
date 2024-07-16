public class ExerCise1 {
    //演示逻辑运算符的使用
    public static void main(String[]args){
        //&&短路与 和 &逻辑与 的演示
        //&&的使用
        int age = 20;
        if(age < 30 && age > 10){
            System.out.println("ok");
        }
        //&的使用
        int age1 = 20;
        if(age1 < 30 & age1 > 15){
            System.out.println("ko");
        }
        //&和&&的区别
        int a = 4;
        int b = 5;
        //对于&&短路与而言 如果第一个条件为false 后面的条件不在判断
        if (a < 1 && ++b < 50){
            System.out.println("ok666");//false未输出
        }
        //对于&逻辑与而言 如果第一个条件为false 后面的条件仍然会判断
        System.out.println("a=" + a + "b=" + b);//4 5
        if (a < 1 & ++b < 50){
            System.out.println("ko666");//false未输出
        }
        System.out.println("a=" + a +"b=" + b);//4 6
    }
}
