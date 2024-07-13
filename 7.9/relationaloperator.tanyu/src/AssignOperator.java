public class AssignOperator {
    public static void main(String[]args){
        //演示赋值运算符的使用
        int n1 = 10;//n1=10
        n1 += 4;//n1 = n1 + 4;
        System.out.println(n1);//输出为14 n1 = 14
        n1 /= 3;//n1 = n1 / 4;
        System.out.println(n1);//4

        //符合赋值运算符会进行类型转化
        byte num2 = 10;
        num2 += 4;//等价于num2 = (byte)(10 + 4)
        System.out.println(num2);//14
        num2++;//等价于num2 = (byte)(14 + 1)
        System.out.println(num2);//15
    }
}
