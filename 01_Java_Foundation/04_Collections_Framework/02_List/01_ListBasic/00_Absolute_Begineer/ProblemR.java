/* ProblemR — Combine Two Lists Using addAll()
Absolute Beginner
1. Problem Statement
Write a Java program to:
1. Create two List<Integer> objects.
2. Add 10, 20, 30 to the first List.
3. Add 40, 50, 60 to the second List.
4. Print both Lists.
5. Use addAll() to add every element from the second List to the first.
6. Print the combined List and its size.
Expected Output:
First List: [10, 20, 30]
Second List: [40, 50, 60]
Combined List: [10, 20, 30, 40, 50, 60]
Size: 6*/
import java.util.ArrayList;
import java.util.List;
public class ProblemR {
    public static void main(String[] args) {
       List<Integer> firstList = new ArrayList<>();
       firstList.add(10);
       firstList.add(20); 
       firstList.add(30);

       List<Integer> secondList = new ArrayList<>();
       secondList.add(40);
       secondList.add(50);
       secondList.add(60);

       System.out.println("First List: " + firstList);
       System.out.println("Second List: " + secondList);
        firstList.addAll(secondList);
       System.out.println("CombinedList: " + firstList);
       System.out.println("Size: " + firstList.size());
       
    }
}
