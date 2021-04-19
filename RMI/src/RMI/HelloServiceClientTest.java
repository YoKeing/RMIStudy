package RMI;

import java.rmi.Naming;
import java.text.SimpleDateFormat;

public class HelloServiceClientTest {
    public static void testSayHello(){
        try{
            IHelloService rhello=(IHelloService) Naming.lookup("rmi://127.0.0.1:8888/HelloService");
            SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
            //Date date=dateformat.parse("2020-10-01);
            movie mv = new movie("我和我的祖国",120,dateformat.parse("2020-10-1"),1);
           /* System.out.println(mv.getDate());
            System.out.println(mv.getId());
            System.out.println(mv.getLength());
            System.out.println(mv.getName());*/
            System.out.println(rhello.sayHello("哈哈哈"));
            System.out.println(rhello.sum(454,5457));
            System.out.println(rhello.getmovie(mv));
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testSayHello();
    }
}
