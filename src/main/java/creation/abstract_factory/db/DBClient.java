package creation.abstract_factory.db;

class DBClient {
    private Connection connection;
    private Command command;
    private ResultSet resultSet;

    public DBClient(DBFactory factory) {
        this.connection = factory.createConnection();
        this.command = factory.createCommand();
        this.resultSet = factory.createResultSet();
    }

    public void performDBOperations() {
        this.connection.open();
        this.command.execute("SELECT * FROM users");
        this.resultSet.getResults();
        this.connection.close();
    }
}
