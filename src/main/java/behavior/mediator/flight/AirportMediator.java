package behavior.mediator.flight;

public class AirportMediator implements Mediator{
    private boolean isRunwayAvailable = true;

    @Override
    public boolean isRunwayAvailable() {
        return this.isRunwayAvailable;
    }

    @Override
    public void setRunwayAvailability(boolean runwayStatus) {
        this.isRunwayAvailable = runwayStatus;
    }
}
