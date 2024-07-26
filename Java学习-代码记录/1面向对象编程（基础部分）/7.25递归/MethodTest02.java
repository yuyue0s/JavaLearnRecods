public class MethodTest02 {
    public static void main(String[] args) {
        //（2）引用类型传递的是地址（传递也是值，但值是地址），可以通过形参改变实参
        int arr[] = {1,2,3};
        B test = new B();
        test.exchange(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    }
}
class B{
    public void exchange(int arr[]){
        arr[0] = 6;

    }
}
