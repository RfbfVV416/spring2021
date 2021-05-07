package albe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

        Main magazineRating = context.getBean(Main.class);
        System.out.println(magazineRating.toString());









    }

}

@ComponentScan(value = "base")
@Configuration
class SpringConfiguration {
    @Bean
    public MagazineRating rating() {
        return new MagazineRating((float) 0.1, "123");
    }
}
