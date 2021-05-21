import java.util.Observable;

public class UpdateCenter extends Observable {
    public void setVersions(Version version){
        setChanged();
        notifyObservers(version);
    }
}
