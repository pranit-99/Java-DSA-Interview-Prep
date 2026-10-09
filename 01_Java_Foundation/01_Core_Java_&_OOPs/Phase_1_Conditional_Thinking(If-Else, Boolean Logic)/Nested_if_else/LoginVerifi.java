/*A user can successfully log in only after passing two checks:

Checkpoint 1: Username must be "admin".

Checkpoint 2: If the username is correct, password must be "java123".

Input
String username = "admin";
String password = "java123";
Expected Output
Login successful */
public class LoginVerifi {
    public static void main(String[] args) {
        String username = "admin";
        String password = "java123";

        if("admin".equals(username)){
            if("java123".equals(password)){
                System.out.println("Login Successful");
            }else{
                System.out.println("Login UnSuccessful");
            }
        }
    }
}
