package albe;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public void init(){
        MyBean bean = new MyBean("123");
        bean.setNum(2);
    }

}
