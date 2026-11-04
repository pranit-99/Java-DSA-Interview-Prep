/* ProblemW — Keep Only Common Elements Using retainAll()
Intermediate — Level 1
1. Problem Statement
Write a Java program to:
1. Create a List<Integer> named firstList.
2. Add 10, 20, 30, 40, 50, 60.
3. Create a List<Integer> named secondList.
4. Add 20, 40, 60, 80.
5. Use retainAll() to keep only the elements in firstList that are also present in secondList.
6. Print both Lists after the operation.
Expected Output:
First List: [20, 40, 60]
Second List: [20, 40, 60, 80]*/
import java.util.ArrayList;
import java.util.List;
public class ProblemW {
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
       secondList.add(80);

       firstList.retainAll(secondList);

       System.out.println(firstList);
    }
}
