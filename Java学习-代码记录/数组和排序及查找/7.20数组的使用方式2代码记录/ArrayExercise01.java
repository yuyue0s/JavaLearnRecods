public class ArrayExercise01 {
    public static void main(String[]args){
        //1) 创建一个char类型的26 个元素的数组，分别放置'A'-'Z'。使用for
        //循环访问所有元素并打印出来。提示：char 类型数据运算'A'+2 -> 'C'
        char array1[] = new char[26];
        for (int i = 0; i <26; i++){
            array1[i] = (char)('A' + i);
            System.out.print(array1[i] + " ");
        }

        System.out.println();
        System.out.println("===========================================");

        //2) 请求出一个数组int[]的最大值{4, -1, 9, 10, 23}，并得到对应的下标
        //第一步：假设array[0]是最大值 遍历数组与它进行比较
        int array2[] = {4, -1, 90, 101, 23, 98, 7};
        int max = array2[0];
        int maxNum = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] > max){
                max = array2[i];
                maxNum = i;
            }
        }
        System.out.println(maxNum);
    }
}
