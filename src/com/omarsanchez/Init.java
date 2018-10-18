package com.omarsanchez;

public class Init {
    public Init(){
        Rectangle[] rectangles = {
                new Rectangle(4, 2),
                new Rectangle(6, 3),
                new Rectangle(4, 3),
                new Rectangle(9, 4),
                new Rectangle(4, 1),
                new Rectangle(2, 3)
        };
        double area = 0, perimeter = 0;
        for (Rectangle rectangle :
                rectangles) {
            rectangle.printData();

           if (rectangle instanceof ArithmeticOperator){
               ArithmeticOperator arithmeticOperator = ((ArithmeticOperator)rectangle);
               area += arithmeticOperator.calcArea();
               perimeter += arithmeticOperator.calcPerimeter();
            }
        }
        Utils.print("La suma de areas es ");
        Utils.printLn(area);
        Utils.print("La suma de perimetros es ");
        Utils.printLn(perimeter);
    }
}
