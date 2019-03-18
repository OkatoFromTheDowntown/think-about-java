package main.java.alarm;

import java.util.Observable;
import java.util.Observer;

public class Alarm implements Observer, Sound {

    Observable clock;

    private String time;

    public Alarm(Observable clock) {
        this.clock = clock;
        clock.addObserver(this);
    }

    @Override
    public void update(Observable clock, Object args) {
        if (clock instanceof WorldClock) {
            this.time = ((WorldClock) clock).getTime();
            ring();
        }
    }

    @Override
    public void ring() {
        System.out.println("It's time, it's time!! " + this.time);
    }

}
