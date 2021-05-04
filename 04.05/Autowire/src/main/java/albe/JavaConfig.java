package albe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public void init(){
        Owner owner = new Owner("Owner");
        Dog dog = new Dog(2);

    }

}
