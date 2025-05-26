package main;

import org.springframework.stereotype.Component;

@Component
public class Parrot {

    private String name = "Pran";

//    @PostConstruct
//    public void init() {
//        this.name = "Pran";
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }
}
