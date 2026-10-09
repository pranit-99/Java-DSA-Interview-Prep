public class StudentMarks {
    public static void main(String args[]){
        int marks[]  = {85, 72, 91, 68, 88};
        int studentIndex = 7;

        System.out.println("Total Students: " + marks.length);
        System.out.println("Requested Student Index: " + studentIndex);

        try {
            int studentMarks = marks[studentIndex];
            System.out.println("Student Marks:" + studentMarks);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cannot find student marks.");
            System.out.println("Reason: Student index does not exist.");
        }
        System.out.println("Student marks lookup completed.");
    }
}
