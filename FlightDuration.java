package com.company;
import java.sql.Time;
import java.util.Random;

public class FlightDuration {
    public String durationOfFlight() {
        Random random = new Random();
        int x = 5000 + random.nextInt(5000);
        long hrs = x / 3600;
        x %= 3600;
        long mins = x / 60;
        x %= 60;
        String sum = (hrs + " Hour(s) " + mins
                + " Minute(s) ");
        return sum;
    }

    public Time timeOfFlight() {
        Random random = new Random();
        final int millisInDay = 24*60*60*1000;
        Time time = new Time((long)random.nextInt(millisInDay));
        return time;
    }

}

