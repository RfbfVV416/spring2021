

import java.util.Observable;
import java.util.Observer;

public class Phone implements Observer {
    Version version;
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
            try{
                this.version = (Version)arg;
            }
            catch(ClassCastException ex){
                ex.printStackTrace();
            }

        }).start();
    }
}