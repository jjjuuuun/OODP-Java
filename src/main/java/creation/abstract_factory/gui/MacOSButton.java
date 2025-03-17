package creation.abstract_factory.gui;

class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in MacOS style");
    }
}
