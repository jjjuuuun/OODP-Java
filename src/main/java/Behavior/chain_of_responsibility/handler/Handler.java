package Behavior.chain_of_responsibility.handler;

public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public void handle(int number){
        run(number);
        if (nextHandler != null) {
            this.nextHandler.handle(number);
        }
    }

    protected abstract void run(int number);
}
