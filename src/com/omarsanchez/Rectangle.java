package com.omarsanchez;

public class Rectangle implements ArithmeticOperator {
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

    public void printData() {
        Utils.printLn("Hola soy un rectangulo");
        Utils.printLn("mi base es de " + getBase());
        Utils.printLn("mi altura de " + getHeight());
        Utils.skipLine();
    }

    @Override
    public double calcPerimeter() {
        return base * height;
    }

    @Override
    public double calcArea() {
        return (base + height) * 2;
    }
}
