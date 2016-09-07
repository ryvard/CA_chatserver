package serverpackage;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jmach
 */
public class ClientServices implements ISubject {

    private static ArrayList<IObserver> observers = new ArrayList();
    static ArrayList<String> users = new ArrayList();

    public ClientServices() {
        //observers = new ArrayList();
    }

    @Override
    public void register(IObserver newObserver) {
        observers.add(newObserver);

    }

//    public static void adduser(String user) {
//        users.add(user);
//        String s = "";
//        for (String username : users) {
//            s += username + ",";
//        }
//        notifyObserver("CLIENTLIST:" + s);

    }
    
    public static void removeUser(String user){
        users.remove(user);
        String s = "";
        for (String username : users) {
            s += username + ",";
        }
        notifyObserver("CLIENTLIST:" + s);
    }

    public static void unregister(IObserver deleteObservers) {

        System.out.println("Observer " + deleteObservers + " deleted");
        observers.remove(deleteObservers);

    }

    public static void notifyObserver(String s) {

        for (IObserver observer : observers) {
            observer.update(s);
            
            System.out.println("observers length: " +observers.size());

        }

    }

    public static void notifyObserver(String s, String username) {

    }

    public static void notifyObserver(String s, String[] username) {

    }

}
