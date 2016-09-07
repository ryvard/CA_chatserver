package serverpackage;


import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miaryvard
 */
public class ClientThread extends Thread implements Observer
{

    Socket clientSocket;
    int clientID;
    ArrayList<String> users = new ArrayList();
    String user;

    public ClientThread(Socket clientSocket, int clientID)
    {
        this.clientSocket = clientSocket;
        this.clientID = clientID;

    }

    @Override
    public void run()
    {
        handleClient();

    }

    public void handleClient()
    {
        try
        {
            
            Scanner scan = new Scanner(clientSocket.getInputStream());
            PrintWriter writer = new PrintWriter(clientSocket.getOutputStream(), true);
            
            writer.println("Du skal logge ind - f.eks. LOGIN:<username>");
            String msg = scan.nextLine();

            while (!msg.equals("STOP"))
            {
                if(msg.startsWith("LOGIN:"))
                {
                    String[] splitArr = msg.split(":");
                    user = splitArr[1];
                    users.add(user);
                    writer.println("Du er nu logget ind som '"+user+"'");
                }
                
                System.out.println("I WHILE LOOP");
                if(msg.equals("HEJ"))
                {
                    writer.println("HEJ MED DIG");
                }
                writer.println("message recieved");
                msg = user+": " + scan.nextLine();
                System.out.println("msg: "+msg);
            }
            scan.close();
            writer.close();
            clientSocket.close();

        } catch (IOException ex)
        {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
