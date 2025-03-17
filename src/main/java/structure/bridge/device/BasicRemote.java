package structure.bridge.device;

// Abstract Class
class BasicRemote extends Remote {
    public BasicRemote(Device device) {
        super(device);
    }

    @Override
    public void power() {
        if (device.isEnabled()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
