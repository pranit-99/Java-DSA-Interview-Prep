/*Write a Java program that determines a person's age category.

Conditions
Age less than 13  → Child
Age 13–19         → Teenager
Age 20–59         → Adult
Age 60 or above   → Senior
Input
int age = 25;
Expected Output
Adult */
public class AgeCategory {
    public static void main(String[] args) {
        int age = 25;

        if(age < 13){
            System.out.println("Child");
        }else if(age >= 13 && age <= 19){
            System.out.println("Teenager");
        }else if(age >= 20 && age <= 59){
            System.out.println("Adult");
        }else{
            System.out.println("Senior");
        }
    }
}
