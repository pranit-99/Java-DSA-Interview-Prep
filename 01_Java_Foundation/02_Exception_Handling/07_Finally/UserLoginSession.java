public class UserLoginSession {
    public static void main(String[] args) {
        String userID = "USER101";

        try {
            System.out.println("Login session started.");
            int id = Integer.parseInt(userID);
            System.out.println("User ID: " + id);
            System.out.println("Login successful.");

        } catch (NumberFormatException e) {

            System.out.println("Login Failed.");
            System.out.println("Reason: User ID must contain numbers only.");

        } finally {

            System.out.println("Login session closed.");
        }

        System.out.println("Login program completed.");
    }
}
