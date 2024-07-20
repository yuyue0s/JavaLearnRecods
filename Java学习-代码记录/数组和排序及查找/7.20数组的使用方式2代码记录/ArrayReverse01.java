public class ArrayReverse01 {
    public static void main(String[]args){
        //要求：把数组的元素内容反转。
        //arr {11,22,33,44,55,66} -> {66, 55,44,33,22,11}
        //思路分析：(方法1)
        //1. 把arr[0] 和arr[5] 进行交换{66,22,33,44,55,11}
        //2. 把arr[1] 和arr[4] 进行交换{66,55,33,44,22,11}
        //3. 把arr[2] 和arr[3] 进行交换{66,55,44,33,22,11}
        //4. 一共要交换3次 = arr.length / 2
        //5. 每次交换时，对应的下标是arr[i] 和 arr[arr.length - 1 -i]
        int arr1[] = {11,22,33,44,55,66};
        for (int i = 0; i< (arr1.length / 2); i++){
            //先定义一个临时变量
            int temp = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = arr1[i];
            arr1[i] = temp;
        }
        for (int i = 0; i < 6; i++){
            System.out.print(arr1[i] + " ");
        }
    }
}
