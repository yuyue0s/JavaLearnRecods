public class ZiZeng {
    public static void main(String[] args){
        int a = 1;
        ++a;
        System.out.println(a);
        int b = 1;
        b++;
        System.out.println(b);

        int c = 1;
        int d = c++;/*这个式子就等于
        int d = c;
        c++; 首先是d=c等于1 然后再去c++*/
        int e = ++c;
        System.out.println(d);//1
        System.out.println(e);//3

        int q = 1;
        int w = ++q;
        System.out.println(w);//2

        int r = 1;
        int t = r++ * 2;//这个式子等于
        //int t = r * 2;相当于先把++隐藏了了
        //r++;
        System.out.println(t);// 输出2

        int y = 1;
        int s = ++y * 2;
        System.out.println(s);//输出为4
    }
}
