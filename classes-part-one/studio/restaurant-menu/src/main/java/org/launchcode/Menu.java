package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItem> meniItems = new ArrayList<>();
    private LocalDate lastUpdated;

    public ArrayList<MenuItem> getMeniItems() {
        return meniItems;
    }
}
