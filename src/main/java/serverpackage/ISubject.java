package serverpackage;


import serverpackage.IObserver;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jmach
 */
public interface ISubject
{
    public void register(IObserver o);
    public void unregister(IObserver o);
    public void notifyObserver();
    
}
