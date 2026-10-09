import java.io.FileNotFoundException;
import java.io.FileReader;

public class ConfigurationLoader {

    public static void loadConfiguration() {

        try {

            FileReader file =
                new FileReader(
                    "application-config.txt"
                );

            System.out.println(
                "Configuration loaded."
            );

        } catch (FileNotFoundException e) {

            System.out.println(
                "Configuration file not found."
            );
        }
    }

    public static void main(String[] args) {

        loadConfiguration();
    }
}