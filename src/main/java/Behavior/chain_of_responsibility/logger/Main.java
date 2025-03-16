package Behavior.chain_of_responsibility.logger;

public class Main {
    private static Logger getChainOfLoggers() {
        NetworkLogger networkLogger = new NetworkLogger(LogLevel.WARN);
        FileLogger fileLogger = new FileLogger(LogLevel.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(LogLevel.INFO);

        networkLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return networkLogger;
    }

    public static void main(String[] args) {
        Logger chainOfLoggers = getChainOfLoggers();

        chainOfLoggers.logMessage(LogLevel.INFO,
                "This is an information.");
        System.out.println();
        chainOfLoggers.logMessage(LogLevel.DEBUG,
                "This is a debug level information");
        System.out.println();
        chainOfLoggers.logMessage(LogLevel.WARN,
                "This is a warning information");
    }
}
