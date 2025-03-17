package Behavior.chain_of_responsibility.handler;

public class Main {
    public static void main(String[] args) {
        Handler positiveHandler = new PositiveHandler();
        Handler evenHandler = new EvenHandler();
        Handler divisibleByThree = new DivisibleByThreeHandler();

        positiveHandler.setNextHandler(evenHandler);
        evenHandler.setNextHandler(divisibleByThree);

        positiveHandler.handle(-2);
        System.out.println();
        positiveHandler.handle(4);
        System.out.println();
        positiveHandler.handle(6);
    }
}
