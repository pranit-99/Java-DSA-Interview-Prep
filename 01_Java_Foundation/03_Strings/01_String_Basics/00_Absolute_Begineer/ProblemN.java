/*Problem M — Capacity and Memory Management
Absolute Beginner
StringBuffer · Problem 3 of 5

Objective: Learn how StringBuffer manages memory, changes its length, and checks whether it contains characters using five methods.
1. Five methods we'll learn
Method	Purpose	Return type
capacity()	Returns the current storage capacity	int
ensureCapacity()	Ensures the minimum required capacity	void
setLength()	Changes the length of the character sequence	void
trimToSize()	Attempts to reduce unused capacity	void
isEmpty()	Checks whether the StringBuffer contains zero characters	boolean */
public class ProblemN {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        System.out.println("Original: " + sb);

        System.out.println("Initial Capacity: " + sb.capacity());

        sb.ensureCapacity(50);
        System.out.println("After Ensure Capacity: " +sb.capacity());

        sb.setLength(2);
        System.out.println("After Set LEngth: " +sb);
        System.out.println("Current Length" + sb.length());

        sb.trimToSize();
        System.out.println("After TRim to Size: " +sb.capacity());

        // Method 5: isEmpty()
        System.out.println("Is Empty: "+ sb.isEmpty());
    }
}
