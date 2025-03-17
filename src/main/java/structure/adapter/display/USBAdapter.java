package structure.adapter.display;

class USBAdapter implements DisplayAdapter {
    private USB usb;
    private String data;
    public USBAdapter(USB usb, String data) {
        this.usb = usb;
        this.data = data;
    }

    @Override
    public void display() {
        usb.connectWithUsbCable(data);
    }
}

