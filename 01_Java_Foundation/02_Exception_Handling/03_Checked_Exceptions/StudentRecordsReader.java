import java.io.FileNotFoundException;
import java.io.FileReader;

public class StudentRecordsReader {

    public static void main(String[] args) {

        System.out.println("Student Record Processing Started");
        try{
        FileReader file = new FileReader("students.txt");
        System.out.println("Student file opened successfully.");
        } catch (FileNotFoundException e){
            System.err.println("File Not found");
        }
        System.out.println(
            "Student Record Processing Completed"
        );
    }
}