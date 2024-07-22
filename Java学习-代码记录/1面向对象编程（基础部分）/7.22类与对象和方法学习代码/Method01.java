public class Method01 {
    //在某些情况下，我们要需要定义成员方法(简称方法)。比如人类:除了有一些属性外( 年龄，姓名..),我们人类还有一
    //些行为比如:可以说话、跑步..,通过学习，还可以做算术题。这时就要用成员方法才能完成。现在要求对Person 类完善。
    public static void main(String[]args){
        //1) 添加speak 成员方法,输出“我是一个好人”
        //2) 添加cal01 成员方法,可以计算从1+..+1000 的结果
        //3) 添加cal02 成员方法,该方法可以接收一个数n，计算从1+..+n 的结果
        //4) 添加getSum 成员方法,可以计算两个数的和

        tree p1 = new tree();
        p1.speak();
        p1.cal01();
        p1.cal02(10);
        int sum = p1.getSum(40,10);
        System.out.println(sum);
    }
}
class tree {
    //属性
    int age;
    String name;

    //方法
    public void speak() {
        System.out.println("我是好人");
    }
    //说明：
    //1. public 表示方法是公开
    //2. void ： 表示方法没有返回值
    //3. speak() : speak 是方法名， () 形参列表
    //4. {} 方法体，可以写我们要执行的代码
    //5. System.out.println("我是一个好人"); 表示我们的方法就是输出一句话
    public void cal01() {
        int sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public void cal02(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public int getSum(int n,int m){
        int sum = n + m;
        return sum;
    }
}
