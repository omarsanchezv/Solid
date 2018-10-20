package com.omarsanchez.Data.interfaces;

import com.omarsanchez.Figuras.Figure;

import java.util.ArrayList;

public interface OnDataReady {
    void onComplete(ArrayList<? extends Figure> figures);
}
