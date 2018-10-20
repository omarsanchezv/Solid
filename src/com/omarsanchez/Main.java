package com.omarsanchez;

import com.omarsanchez.Data.DataManager;
import com.omarsanchez.Data.DataManagerComplete;
import com.omarsanchez.UseCases.PrintInformationUseCase;

public class Main {

    public static void main(String[] args) {
        new PrintInformationUseCase(DataManager.getInstance().getFigureData());
//        new PrintInformationUseCase(DataManagerComplete.getInstance().getFigureData());
    }
}
