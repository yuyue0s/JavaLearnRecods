import java.util.Scanner;

public class YangHuiTriangleExercise {
    public static void main(String[]args){
        //使用二维数组打印一个 x 行杨辉三角
        //arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请问要打印一个多少行杨辉三角");
        int num = myScanner.nextInt();
        int arr[][] = new int[num][];
        for(int i = 0;i < arr.length;i++){
            //给每一个一维数组开辟new空间
            arr[i] = new int[i + 1];
            //每一个数组的打印数值 类似可以看之前写过的空心金字塔和菱形代码
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == (arr[i].length - 1)){
                    arr[i][j] = 1;
                    System.out.print(1);
                    System.out.print(" ");
                }else {
                    arr[i][j] = (arr[i-1][j-1]) + (arr[i-1][j]);
                    System.out.print(arr[i][j]);
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
