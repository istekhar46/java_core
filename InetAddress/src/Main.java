import  java.io.*;
import  java.net.*;
public class Main
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress ip = InetAddress.getByName("www.google.com");
            System.out.println("Host Name : "+ ip.getHostName());
            System.out.println("Host Address : "+ ip.getHostAddress());
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}