public class ExamScoreProcessor {
    public static void main(String[] args) {
        String scores[]  = {"85", "90", "ABC", "0"};
        int studentIndex = 2;

        try {
            String scoreValue = scores[studentIndex];
            System.out.println("Score Value: " +scoreValue);
            int score = Integer.parseInt(scoreValue);
            System.out.println("Converted Score: " +score);
            int result = 100 / score;
            System.out.println("Result:" +result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Student score not found.");
            System.out.println("Reason: Invalid student index.");
        }catch (NumberFormatException e){
            System.out.println("Invalid score.");
            System.out.println("Reason: Score must contain numbers only.");
        }catch (ArithmeticException e){
            System.out.println("Cannot perform score calculation.");
            System.out.println("Reason: Score cannot be zero.");
        }
        System.err.println("Exam score processing sompleted");
    }
}
