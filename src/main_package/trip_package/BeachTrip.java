package main_package.trip_package;
public class BeachTrip extends Trip {
    Boolean IsBeachTrip;

    public BeachTrip(String Country, int Duration, int Price, boolean Hotel, Boolean IsBeachTrip) {
        super(Country, Duration, Price, Hotel);
        this.IsBeachTrip = IsBeachTrip;
    }
}


