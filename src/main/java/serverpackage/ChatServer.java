package serverpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author miaryvard
 */
public class ChatServer
{

    private static ServerSocket serverSocket;
    private String ip;
    private int portNumb;
    private static boolean keepRunning = true;
    private ClientServices cs = ClientServices.getClientServices();

    public static void main(String[] args)
    {
        try
        {
            if (args.length != 2)
            {
                throw new IllegalArgumentException("Error: Use like: java -jar EchoServer.jar <ip> <port>");
            }
            String ip = args[0];
            int port = Integer.parseInt(args[1]);
            //Log.setLogFile("logFile.txt", "ServerLog");
            new ChatServer().runServer(ip, port);
        } catch (Exception ex)
        {
            Logger.getLogger(Log.LOG_NAME).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    private void runServer(String ip, int portNumb)
    {
        int id = 0;
        this.ip = ip;
        this.portNumb = portNumb;
        Logger.getLogger(Log.LOG_NAME).log(Level.INFO, "Server started. Listening on: " + portNumb + ", bound to: " + ip);
        try
        {
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress(ip, portNumb));

            while (keepRunning)
            {
                Socket socket = serverSocket.accept();
                Logger.getLogger(Log.LOG_NAME).log(Level.INFO, "Connected to a client");
                ClientThread ct = new ClientThread(socket, id++);
                ct.start();
                ct.setName("anonym");

                System.out.println("Connect to a client" + id);
            }

        } catch (IOException ex)
        {
            Logger.getLogger(Log.LOG_NAME).log(Level.SEVERE, null, ex);
            System.out.println(ex);
        }
    }

    public static void stopServer()
    {
        keepRunning = false;
    }

}
