package config;

import main.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean/*(name = "edgar")*/
    Person person(){
        Person person = new Person();
        person.setFirstName("Edgar");
        return person;
    }
    @Bean
    @Primary/*(value = "alexander")*/
    Person person2(){
        Person person = new Person();
        person.setFirstName("Alexander");
        return person;
    }
    @Bean/*("david")*/
    Person person3(){
        Person person = new Person();
        person.setFirstName("David");
        return person;
    }
}
