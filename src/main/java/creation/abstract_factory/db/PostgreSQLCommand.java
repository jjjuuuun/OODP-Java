package creation.abstract_factory.db;

class PostgreSQLCommand implements Command {
    public void execute(String query) {
        System.out.println("Executing PostgreSQL query: " + query);
    }
}
