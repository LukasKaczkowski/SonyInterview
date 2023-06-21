package org;

public class Employee extends Observer {
    private String role;

    public void update(String state, String from) {
        System.out.println("NOTIFICATION for " + getName()
                + " with position " + getRole()
                + ": Machine " + from + " has changed state to " + state );
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
