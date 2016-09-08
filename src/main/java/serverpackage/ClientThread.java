package serverpackage;

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
public class ClientThread extends Thread implements IObserver
{

    Socket clientSocket;
    int clientID;
    String user;
    ClientServices cs = ClientServices.getClientServices();
    PrintWriter writer;

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
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            writer.println("Du skal logge ind - f.eks. LOGIN:<username>");

            String msg = scan.nextLine();
            String[] splitArr = msg.split(":");
            String command = splitArr[0];

            while (!msg.equals("LOGOUT:"))
            {
                switch (command)
                {
                    case "LOGIN":
                        if (splitArr.length < 2)
                        {
                            writer.println("MISSING username - wrong command");
                            break;
                        }
                        user = splitArr[1];

                        this.setName(user);
                        cs.register(this);
                        Logger.getLogger(Log.LOG_NAME).log(Level.INFO,String.format("%1$S set as username and added to observer list ", user));
                        writer.println("Du er nu logget ind som '" + this.getName() + "'");
                        break;

                    case "MSG":
                        if (splitArr.length < 3)
                        {
                            writer.println("MISSING : wrong command");
                            break;
                        }
                        if (splitArr[1].isEmpty() || splitArr[1].equals(""))
                        {
                            //writer.println("Du forsøger at sende en besked til alle");
                            cs.sendMessageAll(this.getName() + ":" + splitArr[2]);
                        } else
                        {
                            String[] userArr = splitArr[1].split(",");
                            if (userArr.length == 1)
                            {
                                //writer.println("Du forsøger at sende en besked til en person");
                                cs.sendMessageSingle(this.getName() + ":" + splitArr[2], userArr[0]);

                            } else if (userArr.length > 1)
                            {
                                //writer.println("Du forsøger at sende en besked til flere personer");
                                cs.sendMessageMulti(this.getName() + ":" + splitArr[2], userArr);
                            }
                        }
                        break;
//                    case "HELP":
//                        writer.println("MSG::<message>");
//                        writer.println("MSG:<reciever>:<message>");
//                        writer.println("MSG:<reciever>,<reciever>...:<message>");
//                        writer.println("LOGIN:<username>");
//                        writer.println("LOGOUT:");
                }
                if (!command.equals("LOGIN") && !command.equals("MSG") && !command.equals("HELP"))
                {
                    writer.println("INVALID COMMAND");
                }
                msg = scan.nextLine();
                splitArr = msg.split(":");
                command = splitArr[0];
            }
            Logger.getLogger(Log.LOG_NAME).log(Level.INFO,"Closed a Connection");
            cs.unregister(this);
            scan.close();
            writer.close();
            clientSocket.close();

        } catch (IOException ex)
        {
            Logger.getLogger(ClientThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(String s)
    {
        writer.println(s);
    }
}
