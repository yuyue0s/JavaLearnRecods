public class Scanner {
    public static void main(String[]args){
        //演示接受用户的输入
        //步骤
        //Scanner类 表示 简单文本扫描器 在java.util包里
        //1.引入Scanner类所在的包
        //2.创建Scannner 对象， new 创建一个对象
        //    myScanner 就是 Scannenr类的对象
        java.util.Scanner myScanner = new java.util.Scanner(System.in);
        //3.接收用户的输入  使用 相关的方法
        System.out.println("请输入名字");
        //当程序执行到next方法时候 会等待用户输入
        String name = myScanner.next();//接受用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt();
        System.out.println("请输入薪水");
        double salary = myScanner.nextDouble();

        System.out.println("信息如下：");
        System.out.println("name="+name+"age="+age+"salary="+salary);
    }
}
