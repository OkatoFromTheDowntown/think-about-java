package test.java.alarm;

import main.java.alarm.Alarm;
import main.java.alarm.WorldClock;

public class AlarmTest {
    public static void main(String[] args) {

        WorldClock clock = new WorldClock();

        Alarm alarm1 = new Alarm(clock);
        Alarm alarm2 = new Alarm(clock);
        Alarm alarm3 = new Alarm(clock);

        clock.alarm();

    }
}
