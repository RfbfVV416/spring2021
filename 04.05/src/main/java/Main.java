import albe.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {


    public static void main(String[] args) {

        ApplicationContext javaConfigContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        for (String str: javaConfigContext.getBeanDefinitionNames()){
            System.out.println(str);
        }



    }
}

