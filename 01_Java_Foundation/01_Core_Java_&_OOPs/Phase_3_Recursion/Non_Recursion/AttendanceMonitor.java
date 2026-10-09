/*Still a non-recursive void method.

A company stores an employee's working hours for 7 days:

int[] hours = {8, 6, 9, 4, 8, 10, 5};

Each position represents one day:

Day 1 → 8 hours
Day 2 → 6 hours
Day 3 → 9 hours
...

The company classifies each day as:

Less than 6 hours  → Short Day
6 to 8 hours       → Regular Day
More than 8 hours  → Overtime Day */
public class AttendanceMonitor {
    public static void analyzedAttendance(int hours[]){
        int shorts = 0;
        int regurlar = 0;
        int overtime = 0;
        int sum = 0;
        for(int i = 0; i < hours.length; i++){
            sum = sum + hours[i];

            if(hours[i] < 6){
                System.out.println("Day " + (i + 1) + " :" + hours[i] + " - Short Day");
                shorts = shorts + 1;
            }else if(hours[i] == 6 && hours[i] <= 8){
               System.out.println("Day " + (i + 1) + " :" + hours[i] + " - Regular Day");
               regurlar = regurlar + 1; 
            }else{
                System.out.println("Day " + (i + 1) + " :" + hours[i] + " - Overtime Day");
                if(hours[i] >= 10){
                    System.err.println("! Day requires review");
                }
                overtime = overtime + 1;
            }
        }
        System.out.println("Short Days:"+shorts);
        System.out.println("Regular Days:"+regurlar);
        System.out.println("Overtime Days:"+overtime);
        System.out.println("Total Hours Worked:"+ sum);
    }
    public static void main(String[] args) {
        int[] hours = {8, 6, 9, 4, 8, 10, 5};
        analyzedAttendance(hours);
    }
}
