package ru.qa.begin.First;

public class FirstProgram {
    public static void main(String[] args) {
        hello("world");
        String somebody = "Universe";

        Square s = new Square(5);
        System.out.println("square of cube of size " + s.len + " = " + s.area());


        System.out.println("Hello?" + somebody + "!");

        Rectangle r = new Rectangle(4,6);


        System.out.println("square of piped of side " + r.a + " and " + r.b+ " = " + r.area());
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + "!");
    }






}