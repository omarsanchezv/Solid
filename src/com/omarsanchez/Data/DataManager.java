package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.DataFromLocal;
import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public class DataManager implements Data, DataFromLocal {
    private static DataManager dataManager;

    private DataManager() {

    }

    public static Data getInstance() {
        if (dataManager == null) {
            dataManager = new DataManager();
        }
        return dataManager;
    }

    @Override
    public ArrayList<? extends Figure> getFigureData() {
        return getDataFromLocal();
    }

    @Override
    public ArrayList<? extends Figure> getDataFromLocal() {
        return Init.getInstance().getFigures();
    }
}
