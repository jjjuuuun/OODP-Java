package behavior.mediator.flight;

class Flight {
    private Mediator aiportMediator;
    private String flightNumber;

    public Flight(Mediator aiportMediator, String flightNumber) {
        this.aiportMediator = aiportMediator;
        this.flightNumber = flightNumber;
    }

    public void land() {
        if (this.aiportMediator.isRunwayAvailable()) {
            System.out.println("Flight " + this.flightNumber + " is landing.");
            this.aiportMediator.setRunwayAvailability(false);
        } else {
            System.out.println(
                    "Flight " + this.flightNumber + " is waiting to land.");
        }
    }
}
