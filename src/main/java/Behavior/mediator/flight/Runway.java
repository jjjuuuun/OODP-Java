package Behavior.mediator.flight;

class Runway {
    private Mediator airportMediator;

    public Runway(Mediator airportMediator) {
        this.airportMediator = airportMediator;
    }

    public void clear() {
        System.out.println("Runway is clear.");
        this.airportMediator.setRunwayAvailability(true);
    }
}