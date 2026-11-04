/*Problem U — Find the First Bad Version Using Binary Search
Difficulty: Beginner
New concept: Binary Search using a boolean (true/false) condition.
Problem statement
You are given n software versions numbered from 1 to n.

At some point, a version becomes defective. Every version released after that is also defective.

Find the first bad version using Binary Search.
Input
int totalVersions = 10;
int firstBadVersion = 6;


Expected output:
First bad version: 6 */
public class ProblemU {
    public static boolean isBadVersion(int version, int firstBadVersion){
            return version >= firstBadVersion;
        }
    public static void main(String[] args) {
        int totalVersions = 10;
        int firstBadVersion = 6;

        int left = 1;
        int right = totalVersions;
        int result = -1;

        while(left <= right){
            int mid = left + (right - left) / 2;
            if(isBadVersion(mid, firstBadVersion)){
                result = mid;
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        System.out.println("First bad version: " + result);
    }
}
