package com.omarsanchez.UseCases;

import com.omarsanchez.Figuras.ArithmeticOperator;
import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Utils;

import java.util.ArrayList;

public class PrintInformationUseCase {
    private double area;
    private double perimeter;

    public PrintInformationUseCase(ArrayList<? extends Figure> figures) {
        printFigures(figures);
        printArea(figures);
        printPerimeter(figures);
    }

    private void printArea(ArrayList<? extends ArithmeticOperator> operators) {
        Utils.printLn("La suma de areas es " + totalArea(operators));
    }

    private void printFigures(ArrayList<? extends Figure> figures) {
        figures.forEach(Figure::print);
    }

    private void printPerimeter(ArrayList<? extends ArithmeticOperator> operators){
        Utils.printLn("La suma de perimetros es "+ totalPerimeter(operators));
    }

    private double totalArea(ArrayList<? extends ArithmeticOperator> operators) {
        this.area = 0;
        operators.forEach(this::sumArea);
        return area;
    }

    private double totalPerimeter(ArrayList<? extends ArithmeticOperator> operators){
        this.perimeter = 0;
        operators.forEach(this::sumPerimeter);
        return perimeter;

    }


    private void sumArea(ArithmeticOperator operator) {
        this.area += operator.calcArea();
    }

    private void sumPerimeter(ArithmeticOperator operator){
        this.perimeter += operator.calcPerimeter();
    }


}
