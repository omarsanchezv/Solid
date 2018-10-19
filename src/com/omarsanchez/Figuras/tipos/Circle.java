package com.omarsanchez.Figuras.tipos;

import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Utils;

public class Circle extends Figure {

    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    public void print() {
        Utils.printLn("Hola soy un circulo");
        Utils.printLn("Con un radio de " + radio);
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
