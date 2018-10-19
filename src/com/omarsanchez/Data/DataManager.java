package com.omarsanchez.Data;

import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public class DataManager implements Data {
    private static DataManager dataManager;

    private DataManager() {

    }

    public static Data getInstance() {
        if(dataManager == null){
            dataManager = new DataManager();
        }
        return dataManager;
    }

    @Override
    public ArrayList<? extends Figure> getDataFromInternet() {
        return null;
    }

    @Override
    public ArrayList<? extends Figure> getDataFromLocal() {
        return Init.getInstance().getFigures();
    }

    @Override
    public ArrayList<? extends Figure> saveData(ArrayList<? extends Figure> data) {
        return null;
    }

    @Override
    public ArrayList<? extends Figure> readData() {
        return null;
    }
}
