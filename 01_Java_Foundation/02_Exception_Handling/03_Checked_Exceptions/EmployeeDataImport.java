import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeDataImport {

    public static void main(String[] args) {

        System.out.println(
            "Employee Data Import Started"
        );

        try {

            FileReader file =
                new FileReader(
                    "employees.txt"
                );

            int data =
                file.read();

            System.out.println(
                "Employee Data: " + data
            );

        } catch (FileNotFoundException e) {

            System.out.println(
                "Employee file was not found."
            );

        } catch (IOException e) {

            System.out.println(
                "Problem while reading employee file."
            );
        }

        System.out.println(
            "Employee Data Import Completed"
        );
    }
}