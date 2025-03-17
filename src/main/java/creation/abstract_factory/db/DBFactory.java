package creation.abstract_factory.db;

interface DBFactory {
    Connection createConnection();
    Command createCommand();
    ResultSet createResultSet();
}
