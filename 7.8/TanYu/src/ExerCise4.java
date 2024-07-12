public class ExerCise4 {
    public static void main (String[] args){
        double a = 5 / 9;
        double b = 5.0 / 9;
        int c = 5 / 9;
        double d = 10 / 9;
        System.out.println(a);//0
        System.out.println(b);//0.555555555555556
        System.out.println(c);//0
        System.out.println(d);//1.0
        //定义一个变量保存华氏温度，华氏温度转化摄氏温度的公式为：
        //5/9*（华氏温度-100），请求出华氏温度对应的摄氏温度。[234.5]
        double fTemperaTure = 234.5;
        double cTemperaTure = 5.0 / 9 * (fTemperaTure - 100);
        System.out.println("华氏温度" + fTemperaTure + "对应的摄氏温度为" + cTemperaTure);
    }
}
