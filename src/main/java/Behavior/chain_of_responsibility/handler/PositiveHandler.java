package Behavior.chain_of_responsibility.handler;

public class PositiveHandler extends Handler{
    @Override
    protected void run(int number) {
        if (number > 0) {
            System.out.println(number + " is a positive number");
        }
    }
}
