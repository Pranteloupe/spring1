package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

//    @Bean
//    @Primary
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("Pran");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("PranPran");
//        return p;
//    }
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
