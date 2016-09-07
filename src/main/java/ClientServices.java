
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
public class ClientServices implements Subject
{

    private ArrayList observers;

    public ClientServices()
    {
        observers = new ArrayList();
    }

    @Override
    public void register(Observer newObserver)
    {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObservers)
    {
        int observerIndex = observers.indexOf(deleteObservers);
        System.out.println("Observer " + observerIndex + " deleted");
        if (observerIndex >= 0)
        {
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver()
    {
        for (int i = 0; i < observers.size(); i++)
        {
            Observer observer = (Observer) observers.get(i);
            observer.update();
        }

    }

    public void observerListChange(ArrayList observers)
    {
        this.observers = observers;
        notifyObserver();
    }

}
