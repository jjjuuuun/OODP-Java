package creation.abstract_factory.db;

class MySQLConnection implements Connection {
    public void open() {
        System.out.println("Opening MySQL connection");
    }
    public void close() {
        System.out.println("Closing MySQL connection");
    }
}
