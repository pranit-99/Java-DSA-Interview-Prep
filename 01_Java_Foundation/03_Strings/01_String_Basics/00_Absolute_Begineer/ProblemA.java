/*Problem A — Print Every Character of a String
Difficulty: Absolute Beginner

Problem statement: Given a String, print each character on a separate line using a for loop.

Input:
String str = "JAVA";


Expected output:
J
A
V
A */
public class ProblemA {
   public static void main(String args[]){
    String str = "JAVA";

    for(int i = 0; i < str.length(); i++){
        System.out.println(str.charAt(i));
    }
   } 
}
