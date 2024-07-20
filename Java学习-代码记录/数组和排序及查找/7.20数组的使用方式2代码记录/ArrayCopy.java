public class ArrayCopy {
    public static void main(String[]args){
        //将int[] arr1 = {10,20,30}; 拷贝到arr2 数组, 要求数据空间是独立的.
        int arr1[] = {1,2,3};
        int arr2[] = new int[arr1.length];
        //遍历arr1 ，把每个元素拷贝到arr2 对应的元素位置
        for (int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }
        //此时修改arr2，不会对arr1有影响.
        arr2[0] = 10;
        System.out.println(arr2[0]);//10
        System.out.println(arr1[0]);//1
    }
}
