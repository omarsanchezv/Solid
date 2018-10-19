package com.omarsanchez.Figuras;

import com.omarsanchez.Utils;

public class Rectangle extends Figure {
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

    @Override
    public double calcPerimeter() {
        return (base + height) * 2;
    }

    @Override
    public double calcArea() {
        return base * height;
    }

    @Override
    void print() {
        Utils.printLn("Hola soy un rectangulo");
        Utils.printLn("mi base es de " + getBase());
        Utils.printLn("mi altura de " + getHeight());
        Utils.skipLine();
    }
}
