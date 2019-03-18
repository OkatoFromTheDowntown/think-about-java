package main.java.alarm;

import java.util.Date;
import java.util.Observable;

public class WorldClock extends Observable {

    private String time;

    public WorldClock() {} // There is no need to create the observers list

    public void alarm() {
        setChanged();
        notifyObservers();
    }

    public String getTime() {
        return new Date().toString();
    }

}
