package serverpackage;


import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author miaryvard
 */
public class ChatServer {

    private static ServerSocket serverSocket;
    private String ip;
    private int portNumb;
    private boolean keepRunning = true;
    private ClientServices cs = new ClientServices();
    
    public static void main(String[] args) {
        
        try {
            
            if (args.length != 2) {
                    throw new IllegalArgumentException("Error: Use like: java -jar EchoServer.jar <ip> <port>");
                }
                String ip = args[0];
                int port = Integer.parseInt(args[1]);
                Log.setLogFile("logFile.txt", "ServerLog");
                new ChatServer().runServer(ip, port);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        
        }

    

    private void runServer(String ip, int portNumb) {
        int id = 0;
        this.ip = ip;
        this.portNumb = portNumb;
        Logger.getLogger(Log.LOG_NAME).log(Level.INFO,"Server started. Listening on: " + portNumb + ", bound to: " + ip);       

        try {

            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(ip, portNumb));

            while (keepRunning) {
                
                Socket socket = serverSocket.accept();
                Logger.getLogger(Log.LOG_NAME).log(Level.INFO,"Connected to a client");
                ClientThread ct = new ClientThread(socket,id++);
//                cs.register(ct);
                ct.start();
//                ct.setName("min tråd");
                System.out.println("hvad hedder tråden: "+ct.getName());
                
                
                //System.out.println("username: "+ct.getUserName());
//                System.out.println("Connect to a client" + id);
                
            }
            
            
            

        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
    
    
}
