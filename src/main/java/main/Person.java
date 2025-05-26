package main;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name = "Pranteloupe";

    private Parrot parrot;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person's name : " + name + "\nPerson's parrot: " + parrot.getName();
    }
}
