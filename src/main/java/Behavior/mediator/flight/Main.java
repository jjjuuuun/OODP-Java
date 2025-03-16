package Behavior.mediator.flight;

public class Main {
    public static void main(String[] args) {
        Mediator airportMediator = new AirportMediator();

        Flight flightKE = new Flight(airportMediator, "KE123");
        Flight flightOZ = new Flight(airportMediator, "OZ456");
        Runway runway = new Runway(airportMediator);

        flightKE.land();
        flightOZ.land();
        runway.clear();
        flightOZ.land();
    }
}
