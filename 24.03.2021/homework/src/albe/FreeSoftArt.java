package albe;

import java.util.Objects;

public class FreeSoftArt {
    String name;

    FreeSoftArt(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FreeSoftArt that = (FreeSoftArt) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "FreeSoftArt{" +
                "name='" + name + '\'' +
                '}';
    }
}

