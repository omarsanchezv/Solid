package com.omarsanchez.Data;

import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public interface Data {


    ArrayList<? extends Figure> getDataFromInternet();

    ArrayList<? extends Figure> getDataFromLocal();

    ArrayList<? extends Figure> saveData(ArrayList<? extends Figure> data);

    ArrayList<? extends Figure> readData();
}
