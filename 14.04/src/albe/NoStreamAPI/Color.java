package albe.NoStreamAPI;

public class Color {

    private Integer number;

    private String name;

    public Color(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Color number=" + number +
                ", name='" + name;
    }
}
