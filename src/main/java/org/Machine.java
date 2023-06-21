package org;

public class Machine extends Subject {


    //Personally I would use an enum instead
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void notifyAllObservers() {
        observers.forEach(observer -> observer.update(getState(), name));
    }
}
