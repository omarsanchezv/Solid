package com.omarsanchez;

import com.omarsanchez.Figuras.Rectangle;
import com.omarsanchez.Figuras.Triangle;

public class Init {
    public Init() {
        Rectangle[] rectangles = {
                new Rectangle(4, 2),
                new Rectangle(6, 3),
                new Rectangle(4, 3),
                new Rectangle(9, 4),
                new Rectangle(4, 1),
                new Rectangle(2, 3)
        };
        Triangle[] triangles = {
                new Triangle(2, 1, 1, 1),
                new Triangle(4, 3, 2, 2),
                new Triangle(4, 4, 4, 2)
        };
/////// wtf
        double area = 0, perimeter = 0;
        for (Rectangle rectangle :
                rectangles) {
            rectangle.printData();

            if (rectangle instanceof ArithmeticOperator) {
                ArithmeticOperator arithmeticOperator = ((ArithmeticOperator) rectangle);
                area += arithmeticOperator.calcArea();
                perimeter += arithmeticOperator.calcPerimeter();
            }
        }

        for (Triangle triangle : triangles) {
            triangle.printDataTriangulo();
            if(triangle instanceof ArithmeticOperator){
                ArithmeticOperator arithmeticOperator = triangle;
                area += arithmeticOperator.calcArea();
                perimeter += arithmeticOperator.calcPerimeter();
            }
        }
        //////////
        Utils.print("La suma de areas es ");
        Utils.printLn(area);
        Utils.print("La suma de perimetros es ");
        Utils.printLn(perimeter);
    }
}
