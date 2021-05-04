package albe;

import org.springframework.stereotype.Component;

@Component
public class Owner {
    String name;
    public Owner(String name){
        this.name = name;
    }

}
