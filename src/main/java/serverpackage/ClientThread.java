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
public class ClientThread extends Thread implements IObserver {

    Socket clientSocket;
    int clientID;

    String user;
    ClientServices cs = new ClientServices();
    PrintWriter writer;

    public ClientThread(Socket clientSocket, int clientID) {
        this.clientSocket = clientSocket;
        this.clientID = clientID;

    }

    @Override
    public void run() {
        handleClient();

    }

    public void handleClient() {
        try {

            Scanner scan = new Scanner(clientSocket.getInputStream());
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            writer.println("Du skal logge ind - f.eks. LOGIN:<username>");
            String msg = scan.nextLine();

            while (!msg.equals("LOGOUT:")) {

                if (msg.startsWith("LOGIN:")) {
                    String[] splitArr = msg.split(":");
                    user = splitArr[1];
                    ClientServices.adduser(user);
                    System.out.println("username før"+this.getName());
                    this.setName(user);
                    writer.println("Du er nu logget ind som '" + this.getName() + "'");
                     
                 
                    System.out.println("username log: " + this.getName());
                 
                }

                System.out.println("I WHILE LOOP");
                if (msg.equals("HEJ")) {
                    writer.println("HEJ MED DIG");
                }
                writer.println("message recieved");
                msg = scan.nextLine();

                //msg = user+": " + scan.nextLine();
                System.out.println("msg: " + msg);

            }
            
            ClientServices.removeUser(user);
            ClientServices.unregister(this);
            scan.close();
            writer.close();
            clientSocket.close();

        } catch (IOException ex) {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public void update(String s) {
        writer.println(s);
    }

    public String getUserName() {
        if (user.isEmpty()) {
            return "User is not set";
        }
        System.out.println("username: " + user);
        return user;
    }

}
