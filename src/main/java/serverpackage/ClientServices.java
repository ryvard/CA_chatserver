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
public class ClientServices implements ISubject
{
    private ArrayList observers;

    @Override
    public void register(IObserver newObserver)
    {
        observers.add(newObserver);
    }

    @Override
    public void unregister(IObserver deleteObservers)
    {
        int observerIndex = observers.indexOf(deleteObservers);
        System.out.println("Observer " + observerIndex + " deleted");
        if(observerIndex >= 0){
            observers.remove(observerIndex);
        }
    }

    @Override
    public void notifyObserver()
    {
        for (int i = 0; i < observers.size(); i++)
        {
            IObserver observer = (IObserver) observers.get(i);
            observer.update();
        }
        
    }
    
    public void observerListChange(ArrayList observers){
        this.observers = observers;
        notifyObserver();
    }
    
    
}
