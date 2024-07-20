public class T {
    public static void main(String[] args){
        //三元运算符使用
        int a = 10;
        int b = 99;
        //1.一真大师 a>b为假 所以返回2 不返回1 2就是b--
        //2.返回 b-- 先返回b的值，然后再去b--
        //3.返回的结果是99 而不是98
        //4.如果是--b的话 这个时候返回的值就是98
        int result = a>b ? a++ : b--;
        System.out.println(result);//输出为99
        System.out.println(a);//输出为10
        System.out.println(b);//输出为98
    }
}
