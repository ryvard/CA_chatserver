/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipackage;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author miaryvard
 */
public class inputObserver
{
    private Socket s;
    private Scanner scan;
    private PrintWriter writer;
    private String res;
    

    public Socket connect(String ip, int port) throws IOException
    {
        s = new Socket(ip, port);
        return s;
    }

    
    public String scan() throws IOException
    {
        if(scan == null)
        {
         scan = new Scanner(s.getInputStream());
        }
        while (!scan.nextLine().isEmpty())
        {
            res = scan.nextLine();
        }
        return res;
    }
    
    public void sendtext(String text) throws IOException
    {
        if(writer == null)
        {
            writer = new PrintWriter(s.getOutputStream(), true);
        }
        writer.println(text);
    }


}
