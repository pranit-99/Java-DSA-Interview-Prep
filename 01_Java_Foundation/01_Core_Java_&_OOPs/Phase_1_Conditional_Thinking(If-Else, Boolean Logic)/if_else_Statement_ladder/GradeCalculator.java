/*Write a Java program that prints a student's grade based on marks.

Conditions
90 or above → Grade A
80–89       → Grade B
70–79       → Grade C
60–69       → Grade D
Below 60    → Grade F
Input
int marks = 84;
Expected Output
Grade B */
public class GradeCalculator {
    public static void main(String[] args) {
        int marks = 84;

        if(marks >= 90){
            System.out.println("Grade A");
        }else if(marks >= 80 && marks <= 89){
            System.out.println("Grade B");
        }else if(marks >= 70 && marks <= 79){
            System.out.println("Grade C");
        }else if(marks >= 60 && marks <= 69){
            System.out.println("Grade D");
        }else{
            System.out.println("Grade F");
        }
    }
}
