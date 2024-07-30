//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        Test t1 = new Test(18);
        System.out.println(t1.name);
    }
}
class Test{
    String name;
    int age;
    public Test(String name,int age){
        this.age = age;
        this.name = name;
    }
    public Test(int age){
        this(" ",age);
    }
}