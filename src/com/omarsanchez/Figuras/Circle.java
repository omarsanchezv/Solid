package com.omarsanchez.Figuras;

import com.omarsanchez.Utils;

public class Circle extends Figure {

    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    void print() {
        Utils.print("Hola soy un circulo");
        Utils.print("Con un radio de " + radio);
        Utils.skipLine();
    }

    @Override
    public double calcArea() {
        return radio * radio * 3.1416;
    }

    @Override
    public double calcPerimeter() {
        return radio * 2 * 3.1416;
    }
}
