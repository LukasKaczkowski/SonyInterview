package org;

import java.util.ArrayList;

public class Subject {
    private String state;
    protected ArrayList<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void attach(Observer o) {
        observers.add(o);
    }
    
    public void notifyAllObservers() {

    }
    
    public void setState(String state) {
        this.state = state;
        notifyAllObservers();
    }

    public String getState() {
        return state;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }
}
