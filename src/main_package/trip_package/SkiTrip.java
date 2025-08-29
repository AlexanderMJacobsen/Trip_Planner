package main_package.trip_package;

public class SkiTrip extends Trip {

    boolean isSkiTrip;

    public SkiTrip(String country, int duration, int price, boolean hotel, boolean isSkiTrip){
        super(country, duration, price, hotel);
        this.isSkiTrip = isSkiTrip;

    }

    public boolean getSkiTrip(){
        return this.isSkiTrip;
    }
    public boolean setSkiTrip(boolean isSkiTrip){
        return this.isSkiTrip = isSkiTrip;
    }

    public String toString() {
        return super.toString() +
        "SkiTrip     : "+ isSkiTrip + "\n";
    }
}
