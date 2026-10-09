class SecurityAlert {

    protected int alertId;
    protected String severity;

    void displayAlert() {

        System.out.println(
            "Alert ID: " + alertId
        );

        System.out.println(
            "Severity: " + severity
        );
    }
}


class LoginAlert extends SecurityAlert {

    int failedAttempts;

    void displayLoginAlert() {

        System.out.println(
            "Failed Login Attempts: "
            + failedAttempts
        );
    }
}


class MalwareAlert extends SecurityAlert {

    int infectedFiles;

    void displayMalwareAlert() {

        System.out.println(
            "Infected Files: "
            + infectedFiles
        );
    }
}


class NetworkAlert extends SecurityAlert {

    double suspiciousTrafficMB;

    void displayNetworkAlert() {

        System.out.println(
            "Suspicious Traffic: "
            + suspiciousTrafficMB + " MB"
        );
    }
}


public class CyberSecuritySystem {

    public static void main(String[] args) {

        LoginAlert login =
            new LoginAlert();

        login.alertId = 101;
        login.severity = "Medium";
        login.failedAttempts = 8;

        login.displayAlert();
        login.displayLoginAlert();

        System.out.println("----------------");

        MalwareAlert malware =
            new MalwareAlert();

        malware.alertId = 102;
        malware.severity = "Critical";
        malware.infectedFiles = 15;

        malware.displayAlert();
        malware.displayMalwareAlert();

        System.out.println("----------------");

        NetworkAlert network =
            new NetworkAlert();

        network.alertId = 103;
        network.severity = "High";
        network.suspiciousTrafficMB = 850;

        network.displayAlert();
        network.displayNetworkAlert();
    }
}