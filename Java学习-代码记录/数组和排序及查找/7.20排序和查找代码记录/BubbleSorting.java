public class BubbleSorting {
    public static void main(String[]args){
        //练习1：
        //将五个无序：24,69,80,57,13 使用冒泡排序法将其排成一个从小到大的有序数列。
        int arr[] = {24, 69, 80, 57, 13, 88, 32, 11};
        int temp = 0; //定义一个临时变量来进行转化过度
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
