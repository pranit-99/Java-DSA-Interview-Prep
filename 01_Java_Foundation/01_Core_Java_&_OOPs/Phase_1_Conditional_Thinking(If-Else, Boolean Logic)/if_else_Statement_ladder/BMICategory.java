/*Write a Java program that determines a person's BMI category.

Conditions
BMI < 18.5           → Underweight
BMI 18.5 – 24.9      → Normal
BMI 25.0 – 29.9      → Overweight
BMI 30.0 or above    → Obese
Input
double bmi = 27.5;
Expected Output
Overweight */
public class BMICategory {
    

    public static void main(String args[]) {

        double bmi = 27.5;

        if(bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if(bmi < 25.0) {
            System.out.println("Normal");
        }
        else if(bmi < 30.0) {
            System.out.println("Overweight");
        }
        else {
            System.out.println("Obese");
        }
    }
}

