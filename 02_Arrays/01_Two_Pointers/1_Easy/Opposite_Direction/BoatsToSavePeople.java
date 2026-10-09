/*Problem 3 (B): Boats to Save People
Easy practice
 Opposite-Direction Two Pointers
Pointer Movement: Conditional (left++ and/or right--)
Problem Statement
You are given an integer array people, where each element represents a person's weight, and an integer limit, representing the maximum weight a boat can carry.
Each boat can carry at most two people, and their combined weight must not exceed the limit.
Find the minimum number of boats required to rescue everyone.
Example 1
Input:
people = {1, 2}
limit = 3

Output: 1

Explanation:
Boat 1: (1, 2)


Example 2
Input:
people = {3, 2, 2, 1}
limit = 3

Output: 3

Explanation:
Boat 1: (1, 2)
Boat 2: (2)
Boat 3: (3)


Example 3
Input:
people = {3, 5, 3, 4}
limit = 5

Output: 4 */
import java.util.Arrays;
public class BoatsToSavePeople {
    public static int minimumBoats(int people[], int limit){
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while(left <= right){
            int totalWeight = people[left] + people[right];

            if(totalWeight <= limit){
                left++;
            }
            right--;
            boats++;
        }
        return boats;
    }
    public static void main(String args[]){
        int people[] = {3, 2, 2, 1};
        int limit = 3;
        System.out.println("Minimum Boats: "+ minimumBoats(people, limit));
    }
}
