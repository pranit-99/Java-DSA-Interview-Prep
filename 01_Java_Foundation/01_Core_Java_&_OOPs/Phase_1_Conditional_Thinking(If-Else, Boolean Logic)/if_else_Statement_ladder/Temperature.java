/*Write a Java program that categorizes temperature.

Conditions
Below 0°C    → Freezing
0°C – 15°C   → Cold
16°C – 25°C  → Pleasant
26°C – 35°C  → Hot
Above 35°C   → Very Hot
Input
int temperature = 28;
Expected Output
Hot */
public class Temperature {
    public static void main(String[] args) {
        int Tempetature = 25;

        if(Tempetature < 0){
            System.out.println("Freezing");
        }else if(Tempetature >= 0 && Tempetature <= 15){
            System.out.println("Cold");
        }else if(Tempetature >= 16 && Tempetature <= 25){
            System.out.println("Pleasemt");
        }else if(Tempetature >= 26 && Tempetature <= 35){
            System.out.println("Hot");
        }else{
            System.out.println("Very Hot");
        }
    }
}
