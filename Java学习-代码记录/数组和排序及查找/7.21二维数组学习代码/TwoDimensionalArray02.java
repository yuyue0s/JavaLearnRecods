public class TwoDimensionalArray02 {
    public static void main(String[]args){
        //二维数组的使用方式1： 动态初始化
        //1) 语法: 类型[][] 数组名=new 类型[大小][大小]
        //2) 比如: int a[][] = new int[2][3]
        int arr[][] = new int[2][3];
        //int arr[][];   //声明一个二维数组
        //arr = new int[2][3]; //再去开辟空间
        arr[0][1] = 6; //第一组的一维数组中的第二个值赋值为6
        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // 换行作用
        }

        //二维数组的使用方式2： 动态初始化
        //(1)先声明： 类型 数组名[][];
        //(2)再定义(开辟空间): 数组名 = new 类型[大小][大小];
        //(3)赋值(有默认值，比如int 类型的就是0)
        int arr1[][];
        arr1 = new int[2][3];

        System.out.println("=================");
        //二维数组的使用方式3： 动态初始化---列数不确定
        //看一个需求：动态创建下面二维数组，并输出
        //i = 0: 1
        //i = 1: 2 2
        //i = 2: 3 3 3
        //创建二维数组 一共有三个一维数组 但是每个一维数组还没有开辟空间
        int arr2[][] = new int[3][];
        for(int i = 0; i < arr2.length;i++){
            //先给每个一维数组创建空间
            arr2[i] = new int[i + 1];

            //遍历一遍数组 给一维数组的每个元素赋值
            for (int j = 0; j < arr2[i].length;j++){
                arr2[i][j] = i + 1;
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        //二维数组的使用方式4 静态初始化
        //定义类型数组名[][] = {{值1,值2..},{值1,值2..},{值1,值2..}}
        //使用即可[ 固定方式访问]
        //比如:
        int[][] arr3 = {{1,1,1}, {8,8,9}, {100}};//哪怕只有一个元素100 也不可以去掉{100}外括号
        //解读
        //1. 定义了一个二维数组arr
        //2. arr 有三个元素(每个元素都是一维数组)
        //3. 第一个一维数组有 3 个元素, 第二个一维数组有 3 个元素, 第三个一维数组有 1 个元素
    }
}
