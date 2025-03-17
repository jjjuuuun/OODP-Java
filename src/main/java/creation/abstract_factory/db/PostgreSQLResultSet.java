package creation.abstract_factory.db;

class PostgreSQLResultSet implements ResultSet {
    public void getResults() {
        System.out.println("Getting results from PostgreSQL database");
    }
}
