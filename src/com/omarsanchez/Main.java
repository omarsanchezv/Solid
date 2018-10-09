package com.omarsanchez;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 2);
        Utils.printLn("Hola soy un rectangulo");
        Utils.printLn("mi base es de " + rectangle.getBase());
        Utils.printLn("mi altura de " + rectangle.getHight());
        Utils.printLn("mi perimetro es de " + rectangle.getPerimeter());
        Utils.printLn("mi area es de " + rectangle.getArea());
        Utils.skipLine();
        Rectangle rectangle1 = new Rectangle(6, 3);
        Utils.printLn("Hola soy un rectangulo 1");
        Utils.printLn("mi base es de " + rectangle1.getBase());
        Utils.printLn("mi altura de " + rectangle1.getHight());
        Utils.printLn("mi perimetro es de " + rectangle1.getPerimeter());
        Utils.printLn("mi area es de " + rectangle1.getArea());
    }
}
