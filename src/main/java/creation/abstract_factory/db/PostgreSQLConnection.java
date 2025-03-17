package creation.abstract_factory.db;

class PostgreSQLConnection implements Connection {
    public void open() {
        System.out.println("Opening PostgreSQL connection");
    }
    public void close() {
        System.out.println("Closing PostgreSQL connection");
    }
}
