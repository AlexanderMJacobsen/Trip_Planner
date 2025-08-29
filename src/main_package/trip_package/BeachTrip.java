package main_package.trip_package;
public class BeachTrip extends Trip {
    boolean isBeachTrip;

    public BeachTrip(String country, int duration, int price, boolean hotel, boolean isBeachTrip) {
        super(country, duration, price, hotel);
        this.isBeachTrip = isBeachTrip;
    }
    public boolean getBeachTrip(){
        return isBeachTrip;
    }
    public boolean setBeachTrip(boolean isBeachTrip){
        return this.isBeachTrip = isBeachTrip;
    }
    public String toString() {
        return super.toString() +
        "BeachTrip     : "+ isBeachTrip + "\n";
    }
}


