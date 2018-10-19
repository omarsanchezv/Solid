package com.omarsanchez;

import com.omarsanchez.Figuras.Circle;
import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Figuras.Rectangle;
import com.omarsanchez.Figuras.Triangle;

public class Init {
    public Init() {
        Figure[] figures = {
                new Rectangle(4, 2),
                new Rectangle(6, 3),
                new Rectangle(4, 3),
                new Rectangle(9, 4),
                new Rectangle(4, 1),
                new Rectangle(2, 3),
                new Triangle(2, 1, 1, 1),
                new Triangle(4, 3, 2, 2),
                new Triangle(4, 4, 4, 2),
                new Circle(4),
                new Circle(3),
                new Circle(6)
        };

        double area = 0, perimeter = 0;

        for (Figure figure : figures){
            figure.print();
            area += figure.calcArea();
            perimeter += figure.calcPerimeter();
        }

        Utils.print("La suma de areas es ");
        Utils.printLn(area);
        Utils.print("La suma de perimetros es ");
        Utils.printLn(perimeter);
    }
}
