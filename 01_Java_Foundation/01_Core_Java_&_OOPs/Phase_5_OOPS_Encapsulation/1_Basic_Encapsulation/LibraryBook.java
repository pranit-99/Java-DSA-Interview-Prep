/*Basic Encapsulation — Guided Problem 1: Library Book

We'll do 3 guided basic problems with solutions, then 7 problems for you to solve independently.

For these first three, we'll keep the classes small so you become comfortable with the encapsulation structure itself.

Problem Statement

A library wants to maintain information about its books.

Create a class called:

LibraryBook

A book should contain:

bookId
bookTitle
availableCopies
Requirements
All variables must be private.
bookId:
Must be greater than 0.
Can be assigned only once.
Can be viewed using a getter.
bookTitle:
Can be changed.
Cannot be null or empty.
Can be viewed using a getter.
availableCopies:
Can be viewed.
Should not have a normal setter.
Create a method:
addCopies(int copies)

It should:

Add copies to the existing number.
Only accept a number greater than 0.
Otherwise display "Invalid number of copies". */
public class LibraryBook {
    private int bookId;
    private String bookTitle;
    private int availableCopies;

    public void setBookID(int bookId){
        if(this.bookId == 0 && bookId > 0){
            this.bookId = bookId;
        }else{
            System.out.println("Invalid Book ID or Book ID already assigned");
        }
    }

    public int getBookID(){
        return bookId;
    }

    public void setBookTitle(String bookTitle){
        if(bookTitle != null && !bookTitle.isEmpty()){
            this.bookTitle = bookTitle;
        }else{
            System.out.println("Invalid book title");
        }
    }

    public String getBookTitle(){
        return bookTitle;
    }

    public int getAvailableCopies(){
        return availableCopies;
    }

    public void addCopies(int copies){
        if(copies > 0){
            this.availableCopies = this.availableCopies + copies;
        }else{
            System.out.println("Invalid number of copies");
        }
    }
    public static void main(String args[]){
        LibraryBook book = new LibraryBook();

        book.setBookID(101);

        book.setBookTitle("Java Fundamentals");

        book.addCopies(5);

        book.addCopies(3);

        System.out.println("Book ID: "
                + book.getBookID());

        System.out.println("Book Title: "
                + book.getBookTitle());

        System.out.println("Available Copies: "
                + book.getAvailableCopies());
    }
}
