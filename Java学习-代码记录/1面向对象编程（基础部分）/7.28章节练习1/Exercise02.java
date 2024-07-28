public class Exercise02 {
    public static void main(String[] args) {
        //练习4：编写类A03,实现数组的复制功能copyArr，输入旧数组，返回一个新数组，元素和旧数组一样
        int arr[] = {11,23,54,65,76,12};
        A03 test4 = new A03();
        int arrNew[] = test4.copyArr(arr);
        for (int i = 0;i < arrNew.length;i++){
            System.out.print(arrNew[i] + " ");
        }
        System.out.println("===============");
        //练习5：定义一个圆类Circle,定义属性:半径，提供显示圆周长功能的方法，提供显示圆面积的方法
        Circle c1 = new Circle(5.0);
        System.out.println(c1.perimeter());
        System.out.println(c1.area());
        System.out.println("===============");
        //练习6：编程创建一个Cale计算类，在其中定义2个变量表示两个操作数，定义四个方法
        //实现求和、差、乘、商(要求除数为0的话，要提示)并创建两个对象，分别测试
        Calculator test6 = new Calculator(8);
        System.out.println(test6.add(8));
        System.out.println(test6.division(0));
        Calculator test66 = new Calculator(7.9);
        System.out.println(test66.subtraction(6.1));
    }

}
class Calculator{
    double numberOne;

    public Calculator(double numberOne){
        this.numberOne = numberOne;
    }

    public double add(double numberTwo){ //求和
        return numberOne + numberTwo;
    }
    public double subtraction(double numberTwo){ //subtration 减法
        return numberOne - numberTwo;
    }
    public double multiplication(double numberTwo){ //multiplication 乘法
        return numberOne * numberTwo;
    }
    public double division(double numberTwo){ //division 除法
        if (numberTwo == 0){
            System.out.print("除数为0,无法计算");
            return 0;
        }
        return numberOne / numberTwo;
    }
}
class Circle{  //radius 半径 perimeter 周长 area 面积
    double radius;
    public Circle(double radius){ //构造器
        this.radius = radius;
    }
    public double perimeter(){
        return Math.PI * radius*2;
    }
    public double area(){
        return Math.PI * radius*radius;
    }
}
class A03{
    public int[] copyArr(int arr[]){
        int arrNew[] = new int[arr.length];
        for (int i = 0;i < arr.length;i++){
            arrNew[i] = arr[i];
        }
        return arrNew;
    }
}
