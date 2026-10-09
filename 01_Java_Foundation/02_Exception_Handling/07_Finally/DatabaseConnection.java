public class DatabaseConnection {
    public static void main(String[] args) {
        String recordID = "EMP101";
        try {
            System.out.println("Database connection opened.");
            int id = Integer.parseInt(recordID);
            System.out.println("Record ID: " + id);
            System.out.println("Database operation successful.");

        } catch (NumberFormatException e) {

            System.out.println("Database Operation Failed.");
            System.out.println("Reason: Invalid record ID.");

        } finally {

            System.out.println("Database connection closed.");
        }

        System.out.println("Database program completed.");
    }
}
