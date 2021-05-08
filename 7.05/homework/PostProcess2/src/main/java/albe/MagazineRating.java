package albe;

import org.springframework.stereotype.Component;


public class MagazineRating {
    float value;
    String description;
    String name;
    public MagazineRating(float value, String description, String name){
        this.value = value;
        this.description = description;
        this.name = name;
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
    @ToStr
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MagazineRating{" +
                "value=" + value +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}