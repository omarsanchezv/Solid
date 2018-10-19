package com.omarsanchez;

import com.omarsanchez.Data.DataManager;
import com.omarsanchez.UseCases.PrintInformationUseCase;

public class Main {

    public static void main(String[] args) {
       new PrintInformationUseCase(DataManager.getInstance().getDataFromLocal());
    }
}
