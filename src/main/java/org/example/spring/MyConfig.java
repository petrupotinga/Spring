package org.example.spring;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
//Configuration@ComponentScan("org.example.spring")
public class MyConfig {
    @Bean
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person(catBean());
    }
}
