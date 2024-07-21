public class TwoDimensionalArray01 {
    public static void main(String[]args){
        //什么是二维数组：
        //1. 从定义形式上看 int[][]
        //2. 可以这样理解，原来的一维数组的 每个元素 是一维数组, 就构成二维数组

        //关于二维数组的关键概念
        //(1)二维数组的元素个数
        //System.out.println("二维数组的元素个数=" + arr.length);
        //(2) 二维数组的每个元素是一维数组,
        //    所以如果需要得到每个一维数组的值还需要再次遍历
        //(3) 如果我们要访问第(i+1)个一维数组的第(j+1)个值arr[i][j];;
        //    举例访问3, =》他是第3 个一维数组的第4 个值arr[2][3]

        //请用二维数组输出如下图形
        //0 0 0 0 0 0
        //0 0 1 0 0 0
        //0 2 0 3 0 0
        //0 0 0 0 0 0
        int arr[][] = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0},
                       {0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
        for (int i = 0; i < arr.length; i++){
            for(int j = 0; j< arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //如果我们要访问第(i+1)个一维数组的第(j+1)个值arr[i][j];
        //比如访问第三个一维数组的第四个值--3
        System.out.println(arr[2][3]); //3
        //二维数组的长度 arr.length
        System.out.println(arr.length); //4
        //二维数组中第i个一维数组的长度 arr[i].length
        System.out.println(arr[0].length); //6
    }
}
