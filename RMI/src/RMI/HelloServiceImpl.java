package RMI;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class HelloServiceImpl extends UnicastRemoteObject implements IHelloService {
    public HelloServiceImpl() throws RemoteException{
        super();
    }
    @Override
    public String sayHello(String name) throws RemoteException{
        return "hello: "+name;
    }
    @Override
    public int sum(int a, int b) throws RemoteException{
        return a+b;
    }

    @Override
    public String getmovie(movie a) throws RemoteException {
        return a.getId()+" "+a.getName()+" "+a.getDate()+" "+a.getLength();
    }

    public static void main(String[] args) {
        try{
            IHelloService helloService=new HelloServiceImpl();
            LocateRegistry.createRegistry(8888);
            Naming.bind("rmi://127.0.0.1:8888/HelloService",helloService);
            System.out.println(">>INFO:远程IHello对象绑定成功");
        }catch (RemoteException e){
            System.out.println("创建远程对象发生异常！");
            e.printStackTrace();
        }catch (AlreadyBoundException e){
            System.out.println("发生重复绑定对象异常");
            e.printStackTrace();
        }catch (MalformedURLException e){
            System.out.println("发生URL畸形异常!");
            e.printStackTrace();
        }
    }
}
