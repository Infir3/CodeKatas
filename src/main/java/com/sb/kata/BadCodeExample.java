package com.sb.kata;

import java.util.*;

public class BadCodeExample {
    public static void main(String[] args) {
        PersonsManager pm = new PersonsManager();
        pm.managePersons();
    }
}

class PersonsManager {

    Map<String, Integer> map = new HashMap<>();
    
    public void managePersons() {
        System.out.println("Starting salary calculation ...");
        this.calc(this.getPersons(), System.currentTimeMillis());
        System.out.println("Salary calculation finished!");
    }

    private void calc(List<Person> persons, long time) {
        Person cP;
        int salary;
        int rSalary;
        for (int i = 0; i < persons.size(); i++) {
            cP = persons.get(i);

            if (cP.role == Role.SLAVE) {
                salary = (int) ((double) cP.h * (double) 1);
                if (salary < 50) { salary = 50; }
                if (salary > 200) { salary = 200; }
            } else if (cP.role == Role.WORKER) {
                salary = (int) ((double) cP.h * (double) 10);
                if (salary < 300) {
                    salary = 300;
                }
                if (salary > 4000) {
                    salary = 4000;
                }
            } else if (cP.role == Role.BOSS) {
                salary = (int) ((double) cP.h * (double) 100);
                if (salary < 300) {
                    salary = 300;
                }
            } else {
                throw new IllegalArgumentException("unknown role");
            }
            
            this.map.put(cP.name, salary);
        }

        System.out.println("Result of salary calculation:");
        for (int i = 0; i < persons.size(); i++) {
            cP = persons.get(i);
            rSalary = this.map.get(cP.name);
            System.out.println("Salary for " + cP.name + " (" + cP.getAddress() + "): " + rSalary);
        }
    }

    private List<Person> getPersons() {
        List<Person> persons = new LinkedList<>();
        persons.add(new Person("Bob", Role.SLAVE, 80));
        persons.add(new Person("Alice", Role.WORKER, 38));
        persons.add(new Person("Berta", Role.WORKER, 40));
        persons.add(new Person("Jeff", Role.BOSS, 60));
        return persons;
    }
}

class Person {
    String name;
    Role role;
    int h;

    Person(String name, Role role, int h) {
        this.name = name;
        this.role = role;
        this.h = h;
    }

    String getAddress() {
        return "address from db"; // hier würde die Adresse aus der Datenbank geladen werden
    }
}

enum Role {
    SLAVE, WORKER, BOSS
}
