package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.OnDataReady;

public class DataProvider {
    private Data data;
    private OnDataReady onDataReady;

    public DataProvider(OnDataReady onDataReady){
        this.onDataReady = onDataReady;
        setupData();
    }

    public void getData() {
        data.getData();
    }

    private void setupData(){
        data = new DataManager().getInstance(onDataReady);
//        data = new DataManagerComplete().getInstance(onDataReady);
    }
}
