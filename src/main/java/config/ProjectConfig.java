package config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"proxies", "repositories", "services", "aspects"})
@EnableAspectJAutoProxy
public class ProjectConfig {
    @Bean
    @Scope(BeanDefinition.SCOPE_PROTOTYPE)
    //each time getBean() is called for this bean, a new instance of it is created
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
