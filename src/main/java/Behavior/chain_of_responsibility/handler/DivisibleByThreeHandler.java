package Behavior.chain_of_responsibility.handler;

public class DivisibleByThreeHandler extends Handler {
    @Override
    protected void run(int number) {
        if (number % 3 == 0){
            System.out.println(number + " is divisble by 3");
        }
    }
}
