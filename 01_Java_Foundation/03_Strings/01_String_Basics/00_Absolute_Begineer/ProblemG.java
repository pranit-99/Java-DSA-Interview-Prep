/*Problem F — Basic StringBuilder Operations  
Here, append() modifies the existing StringBuilder object.
2. Five methods we'll learn
Method	Purpose	Return type
append()	Adds characters to the end	StringBuilder
length()	Returns the number of characters	int
charAt()	Returns the character at a specified index	char
setCharAt()	Changes a character at a specified index	void
toString()	Converts StringBuilder content into a String	String

3. Problem statement
Write a Java program using StringBuilder that performs the following operations:
1. Create a StringBuilder containing "Java".
2. Append " Programming" to it.
3. Find the total number of characters.
4. Print the character at index 5.
5. Change the first character from 'J' to 'K'.
6. Convert the modified StringBuilder into a String.*/
public class ProblemG {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Java ");
        System.out.println("Original: " + sb);

        sb.append("Programming");
        System.out.println("After Append: " + sb);

        System.out.println("Length: " + sb.length());

        System.out.println("Character at Index 5:" +sb.charAt(5));

        sb.setCharAt(0, 'K');
        System.out.println("After Modification: " + sb);

        String result = sb.toString();
        System.out.println("Converted String: " + result);
    }
}
