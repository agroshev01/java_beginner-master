package ru.qa.begin.First;

public class FirstProgram {
    public static void main(String[] args) {
        hello("world");
        String somebody = "Universe";

        double len = 5;
        System.out.println("square of cube of size " + len + " = " + area(len));
        System.out.println("Hello?" + somebody + "!");

        double a = 4;
        double b = 6;
        System.out.println("square of piped of side " + a + " and " + b+ " = " + area(a,b));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }

    public static double area(double l) {
        return l * l;
    }

    public static double area(double a, double b) {
        return a*b;

    }


}