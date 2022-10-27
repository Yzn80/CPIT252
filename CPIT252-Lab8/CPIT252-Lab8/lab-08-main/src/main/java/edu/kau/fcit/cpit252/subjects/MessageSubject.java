package edu.kau.fcit.cpit252.subjects;

import edu.kau.fcit.cpit252.observers.Observer;
import java.util.ArrayList;
import java.util.List;

public class MessageSubject implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void subscribe(Observer o) {
        observers.add(o);
        System.out.println(o.getRecipient()+" subscribed");
    }

    @Override
    public void unsubscribe(Observer o) {
        observers.remove(o);
        System.out.println(o.getRecipient()+" unsubscribed");
    }

    @Override
    public void notifyUpdate(String m) {
        for (Observer observer : observers) {
            observer.update(m);
        }
    }
}
