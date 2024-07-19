public class ContinueDetail {
    public static void main(String[]args){
        label1:
        for (int i = 0; i < 2 ; i++) {
            label2:
            for (int j = 0; j < 10; j++) {
                if (j == 2){
                    //continue; //这里等价continue label2 结束最近的循环 开始下一次
                    continue label1;//输出两次 [0,1]
                }
                System.out.println("j=" + j);
            }
        }
    }
}
