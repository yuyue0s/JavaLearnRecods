public class MethodExercise01 {
    public static void main(String[]args){
        //编写类MyTools类，编写一个方法可以打印二维数组的数据。
        int arr[][] = {{4,5,6,7,},{6,5,4},{1,2,3,45}};
        Mytools arrray = new Mytools();
        arrray.toll(arr);
    }
}
class Mytools{
    public void toll(int arr[][]){
        for (int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}