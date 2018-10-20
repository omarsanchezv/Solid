package com.omarsanchez.Data.interfaces;

import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public interface DataFetcher {
    public void saveData(ArrayList<? extends Figure> data);
    public ArrayList<? extends Figure> loadData();
}
