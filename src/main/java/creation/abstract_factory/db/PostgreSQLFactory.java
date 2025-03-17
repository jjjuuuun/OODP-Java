package creation.abstract_factory.db;

class PostgreSQLFactory implements DBFactory {
    public Connection createConnection() {
        return new PostgreSQLConnection();
    }
    public Command createCommand() {
        return new PostgreSQLCommand();
    }
    public ResultSet createResultSet() {
        return new PostgreSQLResultSet();
    }
}
