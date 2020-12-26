import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {

    void debiter(double x)throws RemoteException;
    void crediter(double x)throws RemoteException;
    void lireSolde()throws RemoteException;
}