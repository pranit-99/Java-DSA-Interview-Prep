/* Problem 8 — Employee Performance Rating

A company calculates an employee's performance based on three monthly scores:

int[] scores = {78, 85, 90};

Create:

public static String getPerformanceRating(int[] scores)

First, calculate the average score.

Then return the employee's performance category:

Average >= 90        → "Outstanding"
Average >= 75        → "Good"
Average >= 60        → "Satisfactory"
Average < 60         → "Needs Improvement"*/
public class EmployeePerformance {
    public static String getPerformanceRating(int scores[]){
        int sum = 0;
        for(int i = 0; i < scores.length; i++){
            sum = sum + scores[i];
        }

        int average = sum / scores.length;

        if(average >= 90){
            return "Outstanding";
        }else if(average >= 75){
            return "Good";
        }else if(average >= 60){
            return "Satisfactory";
        }else {
            return "Needs Improvement";
        }
    }
    public static void main(String args[]){
        int scores[] = {78, 85, 90};
        String rating = getPerformanceRating(scores);
        System.out.println("Employee Performance: " +rating);
    }
    
}
