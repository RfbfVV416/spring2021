package albe;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    String name;
    public Owner(){
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }
}
