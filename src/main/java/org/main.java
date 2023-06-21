package org;

public class main {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        Employee employee1 = new Employee();
        employee1.setRole("Worker");
        employee1.setName("John");
        Employee employee2 = new Employee();
        employee2.setRole("Supervisor");
        employee2.setName("Bob");
        Employee employee3 = new Employee();
        employee3.setRole("Overseer");
        employee3.setName("Michael");
        Machine machine1 = new Machine();
        machine1.setName("Cutter");
        machine1.setState("IDLE");
        Machine machine2 = new Machine();
        machine2.setName("Heater");
        machine2.setState("PRODUCING");

        machine1.attach(employee1);
        machine1.attach(employee2);
        machine2.attach(employee3);

        machine1.setState("PRODUCING");
        machine2.setState("STARVED");
    }
}
