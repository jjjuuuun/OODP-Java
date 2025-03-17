package behavior.chain_of_responsibility.logger;

public class NetworkLogger extends Logger{
    public NetworkLogger(LogLevel level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Network::Logger: " + message);
    }
}
