package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.DataFetcher;
import com.omarsanchez.Data.interfaces.DataFromLocal;
import com.omarsanchez.Data.interfaces.DataFromWeb;
import com.omarsanchez.Data.interfaces.OnDataReady;
import com.omarsanchez.Figuras.Figure;
import com.omarsanchez.Utils;

import java.util.ArrayList;

class DataManagerComplete extends Data implements DataFromLocal, DataFromWeb, DataFetcher {
    static Data data;
    ArrayList<? extends Figure> FigureData;

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
    public void getData() {
        FigureData = getDataFromWeb();
        saveData(FigureData);
        dataReady.onComplete(getDataFromLocal());
    }

    @Override
    public Data getInstance(OnDataReady dataReady) {
        if (data == null) {
            data = new DataManagerComplete();
        }
        data.dataReady = dataReady;
        return data;
    }
}
