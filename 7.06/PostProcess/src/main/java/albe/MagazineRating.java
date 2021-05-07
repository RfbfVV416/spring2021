package albe;

public class MagazineRating {
    float value;
    public MagazineRating(float value){
        this.value = value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "MagazineRating{" +
                "value=" + value +
                '}';
    }
}
