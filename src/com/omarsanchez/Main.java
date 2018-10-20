package com.omarsanchez;

import com.omarsanchez.Data.DataProvider;
import com.omarsanchez.UseCases.PrintInformationUseCase;

public class Main {

    public static void main(String[] args) {
        DataProvider dataProvider = new DataProvider(PrintInformationUseCase::new);
        dataProvider.getData();
    }
}
