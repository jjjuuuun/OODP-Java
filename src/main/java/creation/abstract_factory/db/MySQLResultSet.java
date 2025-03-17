package creation.abstract_factory.db;

class MySQLResultSet implements ResultSet {
    public void getResults() {
        System.out.println("Getting results from MySQL database");
    }
}
