public class ArrayExercise03 {
    public static void main(String[]args){
        //写一个冒泡排序的代码
        int arr1[] = {23, 11, 6, 21, 66, 9};
        for(int i = 0; i < arr1.length - 1;i++){
            for(int j = 0; j < arr1.length - 1 - i;j++){
                int temp;
                if(arr1[j] > arr1[j+1]){
                    temp = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
