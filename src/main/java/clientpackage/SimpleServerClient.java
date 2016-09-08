package clientpackage;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author miaryvard
 */
public class SimpleServerClient
{

    public static void main(String args[]) throws IOException
    {
        // Open your connection to a server, at port 1254
        Socket s1 = new Socket("localhost", 8080);
        // Get an input file handle from the socket and read the input
        Scanner scan = new Scanner(s1.getInputStream());
        PrintWriter writer = new PrintWriter(s1.getOutputStream(), true);
        
        String msg = scan.nextLine();
        System.out.println("server msg:"+ msg);
        writer.println("LOGIN:MIA");
        System.out.println("efter login: "+scan.nextLine());
        System.out.println(scan.nextLine());
        writer.println("MSG::HEJ");
        System.out.println(scan.nextLine());
        System.out.println(scan.nextLine());
        writer.println("LOGOUT:");
        
        scan.close();
        writer.close();
        s1.close();
    }

}
