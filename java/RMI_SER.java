
import java.io.*;

import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.*;
public class RMI_SER
{
    public static void main(String args[]) throws Exception
    {
        try
        {
        	Registry reg = LocateRegistry.createRegistry(1098);
        	//Adder skeleton=new AdderRemote();
        	//reg.rebind("rmi://localhost:5000/sonoo", skeleton);
            Palendrome twox = new Palendrome();
            Naming.rebind("rmi://localhost:1098/palin1", twox);   //.rebind("palin", twox);
            System.out.println("Object registered");
        }
        catch(Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
