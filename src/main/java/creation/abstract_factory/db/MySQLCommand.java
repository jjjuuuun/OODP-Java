package creation.abstract_factory.db;

class MySQLCommand implements Command {
    public void execute(String query) {
        System.out.println("Executing MySQL query: " + query);
    }
}