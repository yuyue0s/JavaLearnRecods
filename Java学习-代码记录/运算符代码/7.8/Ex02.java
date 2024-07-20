public class Ex02 {
    public static void main(String[] args){
        int i = 1;
        i++;//自增 等价于i = i + 1
        ++i;//自增 等价于i = i + 1
        System.out.println(i);//输出为3
        int a = 5;
        a--;//自增 等价于a = a - 1
        --a;//自增 等价于a = a - 1
        System.out.println(a);//输出为3

        int t = 5;
        int y = ++t;//++在前 先自增后赋值 这里等价于 t = t+1; y= t;
        System.out.println("t="+t + "y="+y);//输出为t=6 和 y=6

        int j = 5;
        int k = j++;//++在后 先赋值给k在自增 这里等价于k = j; j = j + 1;
        System.out.println(k);//输出为5
        System.out.println(j);//输出为6

        int z = 5;
        int x = --z;
        System.out.println("z="+z + "x=" +x);//输出都为4
        int c = 5;
        int v = c--;
        System.out.println("c="+c + "v="+v);//c=4 v=5

        int n = 1;
        n=n++;
        System.out.println(n);//输出为1

        int m = 1;
        m=++m;
        System.out.println(m);//输出为2

    }
}
