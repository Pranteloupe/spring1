package main;

import config.ProjectConfig;
import models.Comment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import services.CommentService;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Parrot pranpran = new Parrot();
//        pranpran.setName("PranPranPran");
//
//        Parrot cantaloupe = new Parrot();
//        cantaloupe.setName("Cantaloupe");
//
//        Supplier<Parrot> parrotSupplier = () -> pranpran;
//        Supplier<Parrot> canteloupeSupplier = () -> cantaloupe;
//        context.registerBean("parrot", Parrot.class, parrotSupplier);
//        context.registerBean("canteloupe", Parrot.class, canteloupeSupplier, bc -> bc.setPrimary(true));
//
//        Person p = context.getBean(Person.class);
//        System.out.println(p);
//
//        String s = context.getBean(String.class);
//        Integer n = context.getBean(Integer.class);
//
//        System.out.println(s);
//        System.out.println(n);

        var commentService = context.getBean(CommentService.class);

        var comment = new Comment();
        comment.setText("Hello world!");
        comment.setAuthor("Pran");

        commentService.publishComment(comment);
    }
}