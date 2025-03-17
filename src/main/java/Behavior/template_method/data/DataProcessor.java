package Behavior.template_method.data;

abstract class DataProcessor {
    public final void process(String data) {
        this.loadData(data);
        if (this.isValidData(data)) {
            this.processData(data);
            this.saveData(data);
        } else {
            System.out.println("Data is invalid, processing aborted.");
        }
    }

    protected abstract void loadData(String data);
    protected abstract boolean isValidData(String data);
    protected abstract void processData(String data);
    protected abstract void saveData(String data);
}