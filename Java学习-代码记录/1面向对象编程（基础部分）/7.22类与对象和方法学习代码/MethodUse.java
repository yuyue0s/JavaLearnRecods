public class MethodUse {
    public static void main(String[]args){

        //方法的好处：
        //1) 提高代码的复用性
        //2) 可以将实现的细节封装起来，然后供其他用户来调用即可
        //请遍历一个数组, 输出数组的各个元素值。
        int arr[][] = {{1,2,3}, {3,2,1}, {2,3,1}};
        MyTool mytool = new MyTool();
        mytool.tools(arr);

    }
}
class MyTool{
    public void tools(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "");
            }
            System.out.println();
        }
    }
}