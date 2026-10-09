public class FileProcessing {
    public static void main(String args[]){
        String fileData = null;
        try {
            System.out.println("Opening file...");
            int dataLength = fileData.length();
            System.out.println("File Data Length: " + dataLength);
            System.out.println("File processed successfully.");
        } catch (NullPointerException e) {
            System.out.println("File Processing Failed.");
            System.out.println("Reason: File data is null.");
        }finally{
            System.out.println("Closing file...");
        }
        System.out.println("File processing program completed.");
    }
}
