package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot pranpran = new Parrot();
        pranpran.setName("PranPranPran");

        Parrot cantaloupe = new Parrot();
        cantaloupe.setName("Cantaloupe");

        Supplier<Parrot> parrotSupplier = () -> pranpran;
        Supplier<Parrot> canteloupeSupplier = () -> cantaloupe;
        context.registerBean("parrot", Parrot.class, parrotSupplier);
        context.registerBean("canteloupe", Parrot.class, canteloupeSupplier, bc -> bc.setPrimary(true));

        Person p = context.getBean(Person.class);
        System.out.println(p);

        String s = context.getBean(String.class);
        Integer n = context.getBean(Integer.class);

        System.out.println(s);
        System.out.println(n);
    }
}