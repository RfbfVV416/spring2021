import albe.Song;
import albe.StationOne;
import albe.StationTwo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;


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
        System.out.println(context.getBean(StationOne.class));
        System.out.println(context.getBean(StationTwo.class));

        //List<Song> songs = new ArrayList<Song>();
        //context.getBean(Song.class);








    }
}

