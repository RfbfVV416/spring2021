import albe.Dog;
import albe.Owner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Dog dog = javaConfigContext.getBean(Dog.class);
//        Owner owner = javaConfigContext.getBean(Owner.class);
//        System.out.println(dog);
//        System.out.println(owner);
        for (String str : context.getBeanDefinitionNames()){
            System.out.println(str);
        }
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Owner.class));





    }
}

