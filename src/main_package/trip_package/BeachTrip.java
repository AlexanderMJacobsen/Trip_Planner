package main_package.trip_package;
public class BeachTrip extends Trip {
    Boolean isBeachTrip;

    public BeachTrip(String country, int duration, int price, boolean hotel, Boolean isBeachTrip) {
        super(country, duration, price, hotel);
        this.isBeachTrip = isBeachTrip;
    }
}


