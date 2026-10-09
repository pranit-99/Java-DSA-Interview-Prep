/*Rules

First check whether the employee's performanceScore is at least 70.

If performance score is >= 70:

Check years of experience.
Experience >= 5 → "Eligible for promotion"
Otherwise → "Eligible for salary increment"

If performance score is < 70:

Check completed training hours.
Training hours >= 40 → "Continue in current role"
Otherwise → "Additional training required"*/
public class EmployeePerformace {
    public static void main(String args[]) {

        int performanceScore = 65;
        int experience = 6;
        int trainingHours = 45;

        if(performanceScore >= 70) {

            if(experience >= 5) {
                System.out.println("Eligible for promotion");
            } else {
                System.out.println("Eligible for salary increment");
            }

        } else {

            if(trainingHours >= 40) {
                System.out.println("Continue in current role");
            } else {
                System.out.println("Additional training required");
            }
        }
    }
}
