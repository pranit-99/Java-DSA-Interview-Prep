public class LibraryBookIntermediate {
    private int bookId;
    private String bookTitle;
    private int availableCopies;
    private int borrowedCopies;
    private double totalFineCollected;

    //Setting and Getting Book ID
    public void setBookId(int bookId){
        if (this.bookId == 0 && bookId > 0){
            this.bookId = bookId;
            System.out.println("Book ID Assigned Successfully");
        }else{
            System.out.println("BookID must be greater than Zero");
        }
    }

    public int getBookId(){
        return bookId;
    }

    //Setiing and Getting Book Titles
    public void setBookTitle(String bookTitle){
        if(this.bookTitle != null && !bookTitle.isEmpty()){
            this.bookTitle = bookTitle;
            System.out.println("Book Title Assigned Successfully");
        }else{
            System.out.println("Book Title cannot be null");
        }
    }

    public String getBookTitle(){
        return bookTitle;
    }

    // Getting Available Copies(Outside code should not be able to arbitrarily change the number of copies.)
    public int getAvailableCopies(){
        return availableCopies;
    }

    public void addCopies(int copies){
        if(copies > 0){
            this.availableCopies = this.availableCopies + copies;
        }else{
            System.out.println("Invalid Number of Copies");
        }
    }

    //BorrowedCopied
    public int getBorrowedCopies(){
        return borrowedCopies;
    }

    public void borrowBook(int copies){
        if(copies <= 0){
            System.out.println("Invalid borrowing quantity");
        }else if(copies > this.availableCopies){
            System.out.println("Not enough copies available");
        }else{
            this.borrowedCopies = this.borrowedCopies + copies;
            this.availableCopies = this.availableCopies - copies;
            System.out.println("Books borrowed successfully");
        }
    }

    //Fine Collection
    public double getFine(){
        return totalFineCollected;
    }

    //Returning Books
    public void returnBook(int copies, int lateDays){
        if(copies <= 0 || lateDays <0){
            System.out.println("Invalid return Quantity OR Invalid Late Days ");
        }else if(copies > borrowedCopies){
            System.out.println("Cannot return more books than borrowed");
        }else{
            this.totalFineCollected = this.totalFineCollected + (copies * lateDays * 2.0);
            this.borrowedCopies = this.borrowedCopies - copies;
            this.availableCopies = this.availableCopies + copies;
        }
    }

    public static void main(String args[]){
        LibraryBookIntermediate book = new LibraryBookIntermediate();
        book.setBookId(101);
        System.out.println("Book ID:-"+book.getBookId());
        System.out.println("----------------------------------------");
        book.setBookTitle("Java Programming");
        System.out.println("Book Title:-"+book.getBookTitle());
        System.out.println("----------------------------------------");
        book.addCopies(10);
        System.out.println("Total Availale Copies:-"+book.getAvailableCopies());
        System.out.println("----------------------------------------");
        book.borrowBook(3);
        System.out.println("Availale Copies:-"+book.getAvailableCopies());
        System.out.println("Borrowed Copies:-"+book.getBorrowedCopies());
        System.out.println("----------------------------------------");
        book.returnBook(3, 2);
        System.out.println("Availale Copies Returned:-"+book.getAvailableCopies());
        System.out.println("Borrowed Copies:-"+book.getBorrowedCopies());
        System.out.println("Fine Collected:-" + book.getFine());

    }
}
