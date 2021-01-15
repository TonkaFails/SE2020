package de.ah.sews.entity;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;

public class Guest {

    private String firstname;
    private String name;
    private HashMap<LocalDate, LocalDate> period;
    private int age;

    public Guest(String firstname, String name, HashMap<LocalDate, LocalDate> period, int age) {
        this.firstname = firstname;
        this.name = name;
        this.period = period;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<LocalDate, LocalDate> getPeriod() {
        return period;
    }

    public void setPeriod(HashMap<LocalDate, LocalDate> period) {
        this.period = period;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
