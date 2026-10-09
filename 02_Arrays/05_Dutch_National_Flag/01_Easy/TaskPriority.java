/*Problem 2 — Sort Three Categories
An array represents task priorities:
0 = Low
1 = Medium
2 = High

Arrange all Low priorities first, then Medium, then High.
Input:  [1, 2, 0, 1, 2, 0, 1]
Output: [0, 0, 1, 1, 1, 2, 2]

Focus: Recognize DNF even when 0,1,2 represent real-world categories. */
public class TaskPriority {

    public static void main(String[] args) {

        int[] priorities = {1, 2, 0, 1, 2, 0, 1};

        int low = 0;
        int mid = 0;
        int high = priorities.length - 1;

        while (mid <= high) {

            if (priorities[mid] == 0) {

                int temp = priorities[low];
                priorities[low] = priorities[mid];
                priorities[mid] = temp;

                low++;
                mid++;

            } else if (priorities[mid] == 1) {

                mid++;

            } else {

                int temp = priorities[mid];
                priorities[mid] = priorities[high];
                priorities[high] = temp;

                high--;
            }
        }

        for (int priority : priorities) {
            System.out.print(priority + " ");
        }
    }
}