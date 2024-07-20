public class T1 {
    public static void main(String[] args){
        int a;//这是一个定义语句
        a = 11;//这是赋值语句
        a = 13;
        a = 22;
        System.out.println(a);
        int b = 25;//定义并且赋值
        a = 33;
        a = 12;

        int q =1;
        q += 5;//q =(int)q + 5;q = (q的type）（q+5);
        int y = q;
        System.out.println(y);

        short i = 2;
        //i += 4;
        i = (short) (i + 4);
        System.out.println(i);

        int z = 1;
        int c = z += 5;
        System.out.println(c);

        int l =5;
        l += 10;//l = (int)(l+5):
        int k = l;
        System.out.println(l);
        System.out.println(k);
    }
}
