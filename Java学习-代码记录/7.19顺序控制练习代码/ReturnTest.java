public class ReturnTest {
    public static void main(String[]args){
        for (int i = 1; i <= 5 ; i++) {

            if (i == 3){
                System.out.println("TY" + i);
                //break;    用于终止某个语句块的执行
                //continue; 结束当次循环，继续执行下一次循环
                return;   //当return用在方法中，表示退出该方法，如果用在main方法中，表示退出程序
            }
            System.out.println("你好");

        }
        System.out.println("for循环结束");
    }
}
