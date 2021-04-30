import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("context.xml");
        Person a = context.getBean(Person.class);
        System.out.println(a.toString());

    }
}

