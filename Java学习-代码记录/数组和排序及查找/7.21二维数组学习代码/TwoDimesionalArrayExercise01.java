public class TwoDimesionalArrayExercise01 {
    public static void main(String[]args){
        //练习：
        //int arr[][] = {{4,6},{1,4,5,7},{-2}};
        //遍历该二维数组，并得到和
        int arr[][] = {{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for (int i = 0;i < arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("sum=" + sum);
    }
}
