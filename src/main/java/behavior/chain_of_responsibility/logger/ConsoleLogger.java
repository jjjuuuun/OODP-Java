package behavior.chain_of_responsibility.logger;

public class ConsoleLogger extends Logger {
    public ConsoleLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Console::Logger: " + message);
    }
}
