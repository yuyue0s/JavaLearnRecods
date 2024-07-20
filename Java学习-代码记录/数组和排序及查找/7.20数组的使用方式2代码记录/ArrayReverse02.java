public class ArrayReverse02 {
    public static void main(String[]args){
        //数组的反转(方法2)
        //逆序赋值的方法
        //1.创建一个新的数组 arr2
        //2.逆序遍历arr1 每个元素拷贝到arr2
        //3.将arr2 赋值给 arr1
        //另一种写法在ArrayReverse02Test
        int arr1[] = {11,22,33,44,55,66};
        int arr2[] = new int[arr1.length];
        for (int i = arr1.length; i > 0; i--){
            arr2[arr1.length-i] = arr1[i-1];
        }
        for (int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
        System.out.println();
        arr1 = arr2;
        for (int i =0; i < arr1.length;i++){
            System.out.print(arr1[i]+ " ");
        }
    }
}
