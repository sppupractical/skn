import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Pal_Interface extends Remote
{

    public int palin(String a) throws RemoteException;
}
