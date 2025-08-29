package main_package.trip_package;

public class Trip {
    String country;
    int duration;
    int price;
    boolean hotel;

    public Trip(String country, int duration, int price, boolean hotel) {
        this.country = country;
        this.duration = duration;
        this.price = price;
        this.hotel = hotel;
    }

    public String getCountry() {
        return this.country;
    }
    public String setCountry(String country) {
        return this.country = country;
    }
    public int getDuration() {
        return this.duration;
    }
    public int setDuration(int duration) {
        return this.duration = duration;
    }
    public int getPrice() {
        return this.price;
    }
    public int setPrice(int price) {
        return this.price = price;
    }
    public boolean getHotel() {
        return this.hotel;
    }
    public boolean setHotel(boolean hotel){
        return this.hotel = hotel;
    }

    public String toString() {
        return "___________________________________________" + "\n" +
                "Country   : " + country + "\n" +
                "Duration  : " + duration + "\n" +
                "Price     : " + price + "\n" +
                "Hotel     : " + hotel + "\n";
    }
}
