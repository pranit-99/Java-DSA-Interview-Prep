/*Problem 10 — Server Health Monitor

A company's server records CPU usage at different times during the day:

int[] cpuUsage = {45, 60, 72, 85, 91, 67, 55, 88};

Each number represents CPU usage percentage:

45 → 45%
60 → 60%
91 → 91%

Create:

public static String checkServerHealth(int[] cpuUsage)

The method should analyze all CPU readings.

Rules

Count how many readings are:

Above 90%  → Critical readings
Above 75%  → High readings

Then determine the overall server status:

2 or more Critical readings
        ↓
return "Critical"


Otherwise, 3 or more High readings
        ↓
return "Warning"


Otherwise
        ↓
return "Healthy"*/
public class ServerHealth {
    public static String checkServerHealth(int[] cpuUsage) {

        int critical = 0;
        int high = 0;

        // Phase 1: Analyze all CPU readings
        for (int i = 0; i < cpuUsage.length; i++) {

            if (cpuUsage[i] > 90) {

                critical++;

            } else if (cpuUsage[i] > 75) {

                high++;
            }
        }

        // Phase 2: Determine overall server status
        if (critical >= 2) {

            return "Critical";

        } else if (high >= 3) {

            return "Warning";

        } else {

            return "Healthy";
        }
    }

    public static void main(String[] args) {

        int[] cpuUsage = {45, 60, 95, 85, 93, 67, 55, 88};

        String status = checkServerHealth(cpuUsage);

        System.out.println("Server Status: " + status);
    }
}

