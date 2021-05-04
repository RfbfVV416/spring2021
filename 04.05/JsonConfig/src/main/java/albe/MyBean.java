package albe;

import org.springframework.stereotype.Component;

@Component
public class MyBean {
    int num;
    String name;
    public MyBean(String name){
        this.name = name;
    }

    void setNum(int num){
        this.num = num;
    }
}
