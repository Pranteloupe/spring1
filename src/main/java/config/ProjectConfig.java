package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

    @Bean
    public Parrot parrot() {
        var p = new Parrot();
        p.setName("Pran");
        return p;
    }

    @Bean
    public Person person(@Qualifier("parrot2") Parrot parrot) {
        Person p = new Person();
        p.setName("Pranteloupe");
        p.setParrot(parrot);
        return p;
    }

    @Bean
    Parrot parrot2() {
        var p = new Parrot();
        p.setName("PranPran");
        return p;
    }
//
//    @Bean(name = "Samba")
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("PranPranPran");
//        return p;
//    }

    @Bean
    String hello() {
        return "Hello!";
    }

    @Bean
    Integer nine() {
        return 9;
    }
}
