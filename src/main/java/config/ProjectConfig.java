package config;

import org.example.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("PranPran");
        return p;
    }

    @Bean
    String hello() {
        return "Hello!";
    }

    @Bean
    Integer nine() {
        return 9;
    }
}
