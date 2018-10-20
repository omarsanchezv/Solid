package com.omarsanchez.Data;

import com.omarsanchez.Data.interfaces.OnDataReady;

abstract class Data {
    protected OnDataReady dataReady;

    public abstract void getData();

    public abstract Data getInstance(OnDataReady dataReady);

}
