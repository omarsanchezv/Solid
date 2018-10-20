package com.omarsanchez.Data;

import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public interface Data {
    ArrayList<? extends Figure> getFigureData();
}
