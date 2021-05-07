package albe;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ComponentScan(value = "albe")
public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
        System.out.println(context.getBean(MagazineRating.class));

    }

}

@ComponentScan(value = "base")
@Configuration
class SpringConfiguration {
    @Bean
    public MagazineRating ratingOK() {
        return new MagazineRating((float) 0.1, "123");
    }
//    @Bean
//    public MagazineRating ratingNull() {
//        return new MagazineRating((float) 0.1, null);
//    }
//    @Bean
//    public MagazineRating ratingNegative() {
//        return new MagazineRating((float) -0.1, "123");
//    }
//    @Bean
//    public MagazineRating ratingNullNegative() {
//        return new MagazineRating((float) -0.1, null);
//    }
}
