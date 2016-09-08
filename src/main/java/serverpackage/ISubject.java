package serverpackage;

import serverpackage.IObserver;

/**
 *
 * @author Jmach
 */
public interface ISubject
{
    public void register(ClientThread o);
    public void unregister(ClientThread o);
    public void notifyObserver(String s);
    public void notifyObserver(String s,String user);
    public void notifyObserver(String s,String[] users);
}
