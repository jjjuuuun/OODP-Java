package creation.abstract_factory.db;

interface Connection {
    void open();
    void close();
}