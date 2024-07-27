public class VariableParameters01 {
    //java 允许将同一个类中多个同名同功能但参数个数不同的方法，封装成一个方法。就可以通过可变参数实现
    public static void main(String[] args) {
        HspMethods test1 = new HspMethods();
        int arr[] = {1,2,3,100};
        System.out.println(test1.sumn(arr));
    }
}
//举例：类HspMethod，方法sum 【可以计算2 个数的和，3 个数的和， 4. 5， 。。】
class HspMethods{
    public int sumn(double n,int...numbers){
        System.out.println("\t可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后");
        return 0;
    }
    public int sumn(int...numbers){
        //说明：
        //1.int...表示接受的是可变参数，类型是int，即可以接收多个int
        //2.使用可变参数时，可以当作数组使用，即 numbers 可以当作数组
        //3.遍历数组求和即可
        int result = 0;
        for(int i = 0;i < numbers.length;i++){
            result += numbers[i];
        }
        return result;
    }
}