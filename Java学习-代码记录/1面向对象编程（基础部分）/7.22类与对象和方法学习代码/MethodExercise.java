public class MethodExercise {
    public static void main(String[]args){
        //1) 编写类AA ，有一个方法：判断一个数是奇数 还是偶数, 返回boolean
        AA a = new AA();
        boolean value = a.judge(7);
        System.out.println(value);

        //2)根据行、列、字符打印对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果
        BB b = new BB();
        b.print(8,5,'*');
    }
}
class BB{
    public void print(int n1,int n2,char n3){ //n1为行 n2为列 n3为符号
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n1; j++) {
                System.out.print(n3 + " ");
            }
            System.out.println();
        }
    }
}

class AA{
    public boolean judge(int n){
    //方法1
        if ((n % 2) == 0){
            System.out.println("偶数");
            return true;
        }else {
            System.out.println("奇数");
            return false;
        }
//方法2    return n%2 == 0 ? true : false;
//方法3    return n % 2 == 0;
    }
}
