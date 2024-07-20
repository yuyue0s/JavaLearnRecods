public class TestOfStringEquals {
    public static void main(String[]args){
        String user = "谭宇";
        if ("谭宇".equals(user)){ //也可以这样写：user.equals("谭宇")
            //但推荐程序里面的写法("谭宇".equals(user))
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        String a = "大王";
        System.out.println("大王".equals(a)); //true
        System.out.println("666".equals(a)); //false
    }
}
