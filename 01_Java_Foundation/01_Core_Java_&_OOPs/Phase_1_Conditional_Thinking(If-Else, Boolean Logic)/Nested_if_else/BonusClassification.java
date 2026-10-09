/* Now let's continue with the type you requested, where the inner decision changes depending on the outer decision.

An employee can belong to either the Technical or Non-Technical department.

If the employee is Technical:

Experience >= 5 years → "Senior Technical Employee"
Experience < 5 years → "Junior Technical Employee"

If the employee is Non-Technical:

Salary >= 50000 → "Senior Non-Technical Employee"
Salary < 50000 → "Junior Non-Technical Employee"

Use:

String department = "Technical";
int experience = 6;
int salary = 45000;

Expected output:

Senior Technical Employee*/
public class BonusClassification {
    public static void main(String[] args) {
        String department = "Non-Technical";
        int experience = 6;
        int salary = 45000;

        if("Technical".equals(department)){
            if(experience >= 5){
                System.out.println("Senior Technical Employee");
            }else{
                System.out.println("Junior Technical Employee");
            }
        }else{
            if(salary >= 50000){
                System.out.println("Senior Non-Technical Employee");
            }else{
                System.out.println("Junior Non-Technical Employee");
            }
        }

    }
}
