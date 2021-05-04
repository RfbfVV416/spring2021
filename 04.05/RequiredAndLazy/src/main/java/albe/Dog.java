package albe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    Owner owner;
    int age;
    @Lazy
    public Dog(Owner owner){
        this.owner = owner;
    }
}
