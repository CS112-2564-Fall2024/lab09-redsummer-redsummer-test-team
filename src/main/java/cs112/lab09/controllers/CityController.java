package cs112.lab09.controllers;

import cs112.lab09.Constants;
import cs112.lab09.models.RevisedHistoricalEvent;

import static cs112.lab09.Constants.HISTORICAL_DATA;

public class CityController {

    public void initData(Constants.Event eventIndex) {
        String[] data = HISTORICAL_DATA[eventIndex.ordinal()];
        RevisedHistoricalEvent event = new RevisedHistoricalEvent(data);
    }
}
