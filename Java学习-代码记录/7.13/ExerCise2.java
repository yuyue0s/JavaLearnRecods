public class ExerCise2 {
    public static void main(String[]  args){
        //演示||短路或 和 | 逻辑或的演示
        int a = 4;
        int b = 5;
        //对于||短路或而言 如果第一个条件为false 后面的条件不在判断
        if (a < 6 || ++b < 50){
            System.out.println("ok666");//输出ok666
        }
        //对于|逻辑或而言 如果第一个条件为false 后面的条件仍然会判断
        System.out.println("a=" + a + "b=" + b);//4 5
        if (a < 6 | ++b < 50){
            System.out.println("ko666");//输出ko666
        }
        System.out.println("a=" + a +"b=" + b);//4 6
    }
}