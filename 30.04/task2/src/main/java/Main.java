import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static ApplicationContext context;

    public static void main(String[] args) {

        context = new ClassPathXmlApplicationContext("context.xml");
        A a = context.getBean(A.class);
        A a2 = context.getBean(A.class);
        System.out.println(a.getVal());
        System.out.println(a2.getVal());

    }
}

