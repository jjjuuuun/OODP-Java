package creation.factory.vehicle;

abstract class VehicleFactory {
    // Factory method
    abstract Vehicle createVehicle();

    // Operations using the factory method
    public void deliverVehicle() {
        Vehicle vehicle = createVehicle();
        System.out.println("Delivering the vehicle:");
        vehicle.drive();
    }
}
