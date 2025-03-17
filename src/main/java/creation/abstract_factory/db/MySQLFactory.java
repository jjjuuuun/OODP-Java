package creation.abstract_factory.db;

class MySQLFactory implements DBFactory {
    public Connection createConnection() {
        return new MySQLConnection();
    }
    public Command createCommand() {
        return new MySQLCommand();
    }
    public ResultSet createResultSet() {
        return new MySQLResultSet();
    }
}
