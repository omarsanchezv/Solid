package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.DataFromLocal;
import com.omarsanchez.Data.interfaces.OnDataReady;
import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

class DataManager extends Data implements DataFromLocal {
    private static DataManager dataManager;

    @Override
    public ArrayList<? extends Figure> getDataFromLocal() {
        return Init.getInstance().getFigures();
    }

    @Override
    public void getData() {
        dataReady.onComplete(getDataFromLocal());
    }

    @Override
    public Data getInstance(OnDataReady dataReady) {
        if (dataManager == null) {
            dataManager = new DataManager();
        }
        dataManager.dataReady = dataReady;
        return dataManager;
    }
}
