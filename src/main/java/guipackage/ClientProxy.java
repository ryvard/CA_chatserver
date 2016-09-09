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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miaryvard
 */
public class ClientProxy extends Thread
{

    private Socket s;

    private PrintWriter writer;
    private String res;
    ClientConnectGUI1 gui;
    String[] reslist;
    
    public Socket connect(String ip, int port) throws IOException
    {
        s = new Socket(ip, port);
        return s;
    }

    public void registrerObserver(ClientConnectGUI1 gui)
    {
        this.gui = gui;
    }

    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                scan();
            }
        } catch (IOException ex)
        {
            Logger.getLogger(ClientProxy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void scan() throws IOException
    {
        Scanner scan = new Scanner(s.getInputStream());
        System.out.println("Thread startet");
        while (true)
        {
            res = scan.nextLine();
            String[] parts = res.split(":");
            System.out.println("res: " + res);
            if (parts[0].equals("CLIENTLIST"))
            {
                reslist = parts[1].split(",");
                gui.userlistupdated(reslist);
            }
            if (parts[0].equals("MSGRES"))
            {
                gui.msgupdatet(parts[1], parts[2]);
            }
        }
       
    }

    public void sendMSG(String users, String text) throws IOException
    {
        if (writer == null)
        {
            writer = new PrintWriter(s.getOutputStream(), true);
        }
        writer.println("MSG:" + users + ":" + text);
    }

    public void login(String username) throws IOException
    {
        if (writer == null)
        {
            writer = new PrintWriter(s.getOutputStream(), true);
        }
        writer.println("LOGIN:" + username);
    }

    void logout() throws IOException
    {
        if (writer == null)
        {
            writer = new PrintWriter(s.getOutputStream(), true);
        }
        writer.println("LOGOUT:");
    }

}
