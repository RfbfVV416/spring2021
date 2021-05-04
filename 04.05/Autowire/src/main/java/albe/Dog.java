package albe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dog {
    @Autowired
    Owner owner;
    int age;
    public Dog(int age){
        this.age = age;
    }
}
