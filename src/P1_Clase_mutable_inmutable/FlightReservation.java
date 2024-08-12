package P1_Clase_mutable_inmutable;

public final class FlightReservation {

    private final String origin;
    private final String destination;

    private final String originDate;

    private final String arrivalDate;

    public FlightReservation(String origin, String destination, String originDate, String arrivalDate) {
        this.origin = origin;
        this.destination = destination;
        this.originDate = originDate;
        this.arrivalDate = arrivalDate;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getOriginDate() {
        return originDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    @Override
    public String toString() {
        return "FlightReservation{" +
                "origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", originDate='" + originDate + '\'' +
                ", arrivalDate='" + arrivalDate + '\'' +
                '}';
    }
}
