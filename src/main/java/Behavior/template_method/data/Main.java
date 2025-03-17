package Behavior.template_method.data;

public class Main {
    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVProcessor();
        csvProcessor.process("CSV data");

        System.out.println();

        DataProcessor jsonProcessor = new JSONProcessor();
        jsonProcessor.process("XML data");
    }
}