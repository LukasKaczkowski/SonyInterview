package org;

public class Observer {
    private String name;

    public void update(String state, String from) {
        System.out.println("NOTIFICATION "
                + ": Machine " + from + " has changed state to " + state );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
