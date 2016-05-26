package ru.qa.begin.First;

/**
 * Created by agroshev on 26.05.2016.
 */
public class Square {

    public double len;

    public Square(double len) {

        this.len = len;
    };

    public double area() {
        return this.len * this.len;
    }

}
