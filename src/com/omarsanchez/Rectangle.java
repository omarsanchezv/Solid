package com.omarsanchez;

public class Rectangle {
    private int base;
    private int height;

    public Rectangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public double getArea() {
        return base * height;
    }

    public double getPerimeter() {
        return (base + height) * 2;
    }

    public void printData(){
        Utils.printLn("Hola soy un rectangulo");
        Utils.printLn("mi base es de " + getBase());
        Utils.printLn("mi altura de " + getHeight());
        Utils.printLn("mi perimetro es de " + getPerimeter());
        Utils.printLn("mi area es de " + getArea());
        Utils.skipLine();
    }

}
