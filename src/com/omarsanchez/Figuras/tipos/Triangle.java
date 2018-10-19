package com.omarsanchez.Figuras.tipos;

import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Utils;

public class Triangle extends Figure {
    private int base;
    private int aSide;
    private int bSide;
    private int height;

    public Triangle(int base, int aSide, int bSide, int height) {
        this.base = base;
        this.height = height;
        this.aSide = aSide;
        this.bSide = bSide;
    }

    private String getTipe() {
        if (base == aSide && aSide == bSide) {
            return "Equilatero";
        } else if (base == aSide || base == bSide || aSide == bSide) {
            return "Isoceles";
        } else {
            return "Escaleno";
        }
    }

    @Override
    public double calcPerimeter() {
        return base + aSide + bSide;
    }

    @Override
    public double calcArea() {
        return (base + height) * 2;
    }

    @Override
    public void print() {
        Utils.printLn("Hola soy un triangulo");
        Utils.printLn("Soy del tipo " + getTipe());
        Utils.skipLine();
    }
}
