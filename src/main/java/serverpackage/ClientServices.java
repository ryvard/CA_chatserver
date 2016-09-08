package serverpackage;

import java.util.ArrayList;

/**
 *
 * @author Jmach
 */
public class ClientServices implements ISubject
{
    private static ArrayList<ClientThread> observers = new ArrayList();
    private static ClientServices clientServices;

    private ClientServices()
    {
    }
    public static ClientServices getClientServices()
    {
        if(clientServices == null)
        {
            clientServices = new ClientServices();
        }
        return clientServices;
    }

    @Override
    public void register(ClientThread newObserver)
    {
        observers.add(newObserver);
        getClientlist();
    }

    @Override
    public void unregister(ClientThread deleteObservers)
    {
        observers.remove(deleteObservers);
        getClientlist();

    }

    private void getClientlist()
    {
        String s = "";
        for (ClientThread thd : observers)
        {
            s += thd.getName() + ",";
        }
        notifyObserver("CLIENTLIST:" + s);
    }

    public void sendMessageAll(String msg)
    {
        String resmsg = "MSGRES:" + msg;
        notifyObserver(resmsg);
    }

    public void sendMessageSingle(String msg, String username)
    {
        String resmsg = "MSGRES:" + msg;
        notifyObserver(resmsg, username);
    }

    public void sendMessageMulti(String msg, String[] usernames)
    {
        String resmsg = "MSGRES:" + msg;
        notifyObserver(resmsg, usernames);
    }

    @Override
    public void notifyObserver(String s)
    {
        for (ClientThread observer : observers)
        {
            observer.update(s);
        }
    }

    @Override
    public void notifyObserver(String s, String username)
    {
        for (ClientThread observer : observers)
        {
            if (observer.getName().equals(username))
            {
                observer.update(s);
            }
        }

    }

    @Override
    public void notifyObserver(String s, String[] usernames)
    {
        for (ClientThread observer : observers)
        {
            for (String user : usernames)
            {
                if (observer.getName().equals(user))
                {
                    observer.update(s);
                }
            }
        }

    }
}
