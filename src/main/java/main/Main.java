package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot pranpran = context.getBean(Parrot.class);
        System.out.println(pranpran.getName());

        String s = context.getBean(String.class);
        Integer n = context.getBean(Integer.class);

        System.out.println(s);
        System.out.println(n);
    }
}