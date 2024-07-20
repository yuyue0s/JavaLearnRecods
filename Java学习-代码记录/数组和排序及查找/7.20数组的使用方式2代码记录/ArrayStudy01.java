public class ArrayStudy01 {
    public static void main(String[]args){
        //数组的赋值机制
        //1) 基本数据类型赋值，这个值就是具体的数据，而且相互不影响。
        int n1 = 2;
        int n2 = n1;
        n2 = 10;//n1 和 n2 互不影响
        //2) 数组在默认情况下是引用传递，赋的值是地址。
        //数组的赋值方式是引用赋值 是一个地址 arr2变化会影响到arr1（见7.20word解释）
        int arr1[] = {1,2,3};
        int arr2[] = arr1;
        arr2[0] = 99;
        System.out.println(arr1[0]);
    }
}
