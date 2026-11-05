/*Java StringBuffer — Absolute Beginner
Problem K — Basic StringBuffer Operations
Absolute Beginner
StringBuffer · Problem 1 of 5

Objective: Understand how StringBuffer works and learn five fundamental methods using a complete Java program. */
public class ProblemL {
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original :" + sb);

        sb.append(" Programming");
        System.out.println("After Append: " + sb);
        System.out.println("Length: " + sb.length());
        System.out.println("Character at Index 5: " + sb.charAt(5));

        sb.setCharAt(0, 'K');
        System.out.println("After Modification: " + sb);

        String result = sb.toString();
        System.out.println("Converted String: " + result);
    }
}
