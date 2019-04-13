package pl.sdacademy.json;

public class Geolocation {

    private double lat;
    private double lng;


    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }

    @Override
    public String toString() {
        return "Geolocation{" +
                "lat=" + lat +
                ", lng=" + lng +
                '}';
    }
}
