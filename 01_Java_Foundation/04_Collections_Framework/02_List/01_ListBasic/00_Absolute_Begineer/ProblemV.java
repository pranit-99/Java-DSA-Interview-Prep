/*ProblemV — Remove Common Elements Using removeAll()
Intermediate — Level 1
1. Problem Statement
Write a Java program to:
1. Create a List<Integer> named firstList.
2. Add 10, 20, 30, 40, 50, 60.
3. Create another List<Integer> named secondList.
4. Add 20, 40, 60.
5. Use removeAll() to remove from firstList every element that also appears in secondList.
6. Print both Lists after the operation.
Expected Output:
First List: [10, 30, 50]
Second List: [20, 40, 60] */
import java.util.ArrayList;
import java.util.List;
public class ProblemV {
    public static void main(String args[]){
         List<Integer> firstList = new ArrayList<>();
       firstList.add(10);
       firstList.add(20); 
       firstList.add(30);
       firstList.add(40);
       firstList.add(50);
       firstList.add(60);
       

       List<Integer> secondList = new ArrayList<>();
       secondList.add(20);
       secondList.add(40);
       secondList.add(60);

       firstList.removeAll(secondList);

       System.out.println(firstList);
    }
}
