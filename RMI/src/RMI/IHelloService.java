package RMI;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHelloService extends Remote, Serializable {
    public String sayHello(String name) throws RemoteException;
    public int sum(int a,int b) throws RemoteException;
    //查询当天上映影片信息
    public String getmovie(movie a) throws RemoteException;
}
