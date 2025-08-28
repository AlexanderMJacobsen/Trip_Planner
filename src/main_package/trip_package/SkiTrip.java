package main_package.trip_package;

public class SkiTrip extends Trip {

    Boolean IsSkiTrip;

    public SkiTrip(String Country, int Duration, int Price, Boolean Hotel, Boolean IsSkiTrip){
        super(Country, Duration, Price, Hotel);
        this.IsSkiTrip = IsSkiTrip;

    }
}
