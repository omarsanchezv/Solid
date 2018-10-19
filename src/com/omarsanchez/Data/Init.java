package com.omarsanchez.Data;

import com.omarsanchez.Figuras.tipos.Circle;
import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Figuras.tipos.Rectangle;
import com.omarsanchez.Figuras.tipos.Triangle;

import java.util.ArrayList;
import java.util.Arrays;

public class Init {
    private ArrayList<? extends Figure> figures;
    private static Init init;
    private Init() {
        //in order to Test we are going to create a new array
        figures = new ArrayList<Figure>(Arrays.asList(
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
                new Circle(6)));

//        figures = new ArrayList<Rectangle>(Arrays.asList(
//                new Rectangle(4, 2),
//                new Rectangle(6, 3),
//                new Rectangle(4, 3),
//                new Rectangle(9, 4),
//                new Rectangle(4, 1),
//                new Rectangle(2, 3)));
    }

    public static Init getInstance(){
        if(init == null){
            init = new Init();
        }
        return init;
    }

    public ArrayList<? extends Figure> getFigures() {
        return figures;
    }
}
