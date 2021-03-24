package com.company;

import java.util.Objects;

public class Car {
    int year;
    String marka;
    Color color;

    Car(int y, String m, Color col){
        this.year = y;
        this.marka = m;
        this.color = col;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //для случая car1.equals(car1)
        if (o == null || getClass() != o.getClass()) return false; //для случаев car1.equals(null) и car1.equals(экземпляр не типа car)
        Car car = (Car) o; //приведение типа
        return year == car.year &&
                marka.equals(car.marka) &&
                color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, marka, color);
    }
}
