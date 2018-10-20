package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.DataFetcher;
import com.omarsanchez.Data.interfaces.DataFromLocal;
import com.omarsanchez.Data.interfaces.DataFromWeb;
import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Utils;

import java.util.ArrayList;

public class DataManagerComplete implements Data, DataFromLocal, DataFromWeb, DataFetcher {
    static Data data;
    ArrayList<? extends Figure> FigureData;

    public static Data getInstance(){
        if (data == null){
            data = new DataManagerComplete();
        }
        return data;
    }

    @Override
    public void saveData(ArrayList<? extends Figure> data) {
        Utils.printLn("Data Saved");

    }

    @Override
    public ArrayList<? extends Figure> loadData() {
        return Init.getInstance().getFigures();
    }

    @Override
    public ArrayList<? extends Figure> getDataFromLocal() {
        return loadData();
    }

    @Override
    public ArrayList<? extends Figure> getDataFromWeb() {
        Utils.printLn("Requesting to WS");
        return Init.getInstance().getFigures();
    }

    @Override
    public ArrayList<? extends Figure> getFigureData() {
        FigureData = getDataFromWeb();
        saveData(FigureData);
        return getDataFromLocal();
    }
}
