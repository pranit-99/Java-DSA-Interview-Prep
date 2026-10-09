public class PasswordValadition {
    public static void main(String[] args) {
        String password = "java12";

        try {
            System.out.println("Checking password...");
            if (password.length() < 8) {
                throw new IllegalArgumentException(
                    "Password must contain at least 8 characters."
                );
            }

            System.out.println("Password is valid.");
            System.out.println("Login validation successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Password Validation Failed.");
            System.out.println("Reason: " + e.getMessage());
        }
        System.out.println("Login process completed.");
    }
}
