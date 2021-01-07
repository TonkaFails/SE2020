package de.ah.sews.entity;

import java.util.List;

public class Person {

    private String vorname;
    private String nachname;
    private List<String> skills;

    public Person(String vorname, String nachname, List<String> skills) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.skills = skills;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }
}
