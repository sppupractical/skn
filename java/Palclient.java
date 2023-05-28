import java.io.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.net.*;
public class Palclient
{
    public static void main(String args[]) throws Exception
    {
        try
        {
            //String s1 = "rmi://localhost/palin";
            Registry reg = LocateRegistry.getRegistry("localhost",1098);
            Pal_Interface onex = (Pal_Interface)reg.lookup("palin1");
            int m = onex.palin("madam");
            System.out.println("Print : " + m);
            if (m == 1)
            {
                System.out.println("The given string is a Palindrome");
            }
            else
            {
                System.out.println("The given string is not a Palindrome");
            }
        }
        catch (Exception e)
        {
            System.out.println("Exception" + e);
        }
    }
}
