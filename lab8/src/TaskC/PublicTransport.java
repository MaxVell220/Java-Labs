package TaskC;

public abstract class PublicTransport implements Transport {
    private String routeType;
    private int numberSeats;
    private String flightRegularity;

    public PublicTransport(String routeType, int numberSeats, String flightRegularity) {
        this.routeType = routeType;
        this.numberSeats = numberSeats;
        this.flightRegularity = flightRegularity;
    }

    @Override
    public String toString() {
        return "PublicTransport{" +
               "routeType='" + routeType + '\'' +
               ", numberSeats=" + numberSeats +
               ", flightRegularity='" + flightRegularity + '\'' +
               '}';
    }

    @Override
    public void go() {
        Transport.super.go();
        System.out.println("\" по общественному \"");
    }

    @Override
    public void honk() {
        Transport.super.honk();
        System.out.println("\" по общественному \"");
    }
}
