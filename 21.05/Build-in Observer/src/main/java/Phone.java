

import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    @Override
    public int hashCode(){
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }


    @Override
    public void update(Observable o, Object arg) {
        new Thread(() -> {
            System.out.println("Phone version updated");

        }).start();
        System.out.println("Phone version updated");
    }
}