/*ProblemU — Check Whether a List Contains All Elements Using containsAll()
Intermediate — Level 1
Now that you've completed 20 beginner List problems (ProblemA–ProblemT), we'll begin intermediate-level problems, one at a time.

For each problem, you'll first understand the method, then solve it independently. I'll review your code and explain the logic with a dry run.
1. Problem Statement
Write a Java program to:
1. Create a List<Integer> named firstList.
2. Add 10, 20, 30, 40, 50 to it.
3. Create another List<Integer> named secondList.
4. Add 20, 30, 40 to it.
5. Check whether firstList contains all the elements of secondList using containsAll().
6. Print the result.
Expected Output:
true */
import java.util.ArrayList;
import java.util.List;
public class ProblemU {
    public static void main(String[] args) {
        List<Integer> firstList = new ArrayList<>();
       firstList.add(10);
       firstList.add(20); 
       firstList.add(30);
       firstList.add(40);
       firstList.add(50);

       List<Integer> secondList = new ArrayList<>();
       secondList.add(20);
       secondList.add(30);
       secondList.add(20);

       System.out.println(firstList.containsAll(secondList));
    }
}
