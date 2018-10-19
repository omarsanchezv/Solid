package com.omarsanchez.Figuras;

import com.omarsanchez.ArithmeticOperator;
import com.omarsanchez.Utils;

public class Triangle implements ArithmeticOperator {
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


    public void printDataTriangulo() {
        Utils.printLn("Hola soy un triangulo");
        Utils.printLn("Soy del tipo " + getTipe());
        Utils.skipLine();
    }

    private String getTipe(){
        if (base == aSide && aSide == bSide){
            return "Equilatero";
        }else if (base == aSide || base == bSide || aSide == bSide){
            return "Isoceles";
        }else {
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
}
