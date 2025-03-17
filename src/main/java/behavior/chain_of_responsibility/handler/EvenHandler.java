package behavior.chain_of_responsibility.handler;

public class EvenHandler extends Handler{
    @Override
    protected void run(int number) {
        if (number % 2 == 0){
            System.out.println(number + " is an even number");
        }
    }
}
