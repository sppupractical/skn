import java.rmi.*;
import java.lang.*;
import java.rmi.server.*;
public class Palendrome extends UnicastRemoteObject implements Pal_Interface
{
    public Palendrome() throws RemoteException { }
    public int palin(String a) throws RemoteException
    {
        System.out.println("Hello");
        StringBuffer str = new StringBuffer(a);
        String str1 = str.toString();
        System.out.println("Print : " + str1.toString());
        StringBuffer str2 = str.reverse();
        System.out.println("Print : " + str2.toString());
        int b = str1.compareTo(str2.toString());
        System.out.println("Print : " + b);
        if (b == 0)
            return 1;
        else
            return 0;
    }
}
