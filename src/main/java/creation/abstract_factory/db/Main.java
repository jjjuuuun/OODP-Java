package creation.abstract_factory.db;

public class Main {
    public static void main(String[] args) {
        DBClient mysqlClient
                = new DBClient(new MySQLFactory());
        mysqlClient.performDBOperations();

        System.out.println("\nSwitching to PostgreSQL...\n");

        DBClient postgresClient
                = new DBClient(new PostgreSQLFactory());
        postgresClient.performDBOperations();
    }
}
