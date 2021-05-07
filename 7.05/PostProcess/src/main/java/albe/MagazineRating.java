package albe;

public class MagazineRating {
    @NotNegative
    float value;
    @NotNull
    String description;
    public MagazineRating(float value, String description){
        this.value = value;
        this.description = description;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public float getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "MagazineRating{" +
                "value=" + value +
                ", description='" + description + '\'' +
                '}';
    }
}
