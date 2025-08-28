package main_package.trip_package;

public class SkiTrip extends Trip {

    Boolean isSkiTrip;

    public SkiTrip(String country, int duration, int price, Boolean hotel, Boolean isSkiTrip){
        super(country, duration, price, hotel);
        this.isSkiTrip = isSkiTrip;

    }
}
