/*ArrayList — Basic Problem 1: Create and Use an ArrayList

Since we already covered general List basics, these ArrayList problems will focus specifically on understanding ArrayList itself.

Problem Statement

Create a Job Application Tracker using ArrayList<String>.

Store these company names:

Microsoft
Google
Amazon
JPMorgan
Walmart

Then:

Create an ArrayList directly.
Add all five companies.
Print the complete ArrayList.
Print the number of applications.
Retrieve the first and last company. */
import java.util.ArrayList;

public class JobApplicationTracker {
    public static void main(String[] args) {

        //Creating ArrayList
        ArrayList<String> companies = new ArrayList<>();

        // Adding elements
        companies.add("Microsoft");
        companies.add("Google");
        companies.add("Amazon");
        companies.add("JPMorgan");
        companies.add("Walmart");

        //Display complete ArrayList
        System.out.println("Job Appications:");
        System.out.println(companies);

        //Display size
        System.out.println("First Company:" + companies.size());

        //Display first company
        System.out.println("First Company:" + companies.get(0));

        //Display Last company
        System.out.println("Last Company: "+ companies.get(companies.size() - 1));

    }
}
