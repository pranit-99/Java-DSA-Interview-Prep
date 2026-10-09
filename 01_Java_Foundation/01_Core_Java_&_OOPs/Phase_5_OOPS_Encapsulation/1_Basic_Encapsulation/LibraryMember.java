/*Library Membership

This is your final Basic Encapsulation problem. You solve this one yourself.

We are not moving to Intermediate after this automatically. We will move only when you explicitly ask.

Problem Statement

A library wants to manage a member's borrowing status.

Create:

LibraryMember

with these private fields:

private int memberId;
private String memberName;
private int borrowedBooks;
private boolean membershipActive;
Requirements
memberId
Must be greater than 0.
Can be assigned only once.
Provide a getter.
memberName
Cannot be null or empty.
Provide setter and getter.
borrowedBooks
Provide getter only.
Do not provide setBorrowedBooks().
membershipActive
Provide:
public boolean isMembershipActive()
Do not provide a normal setter.
Create:
activateMembership()

If membership is already active:

Membership is already active

Otherwise:

membershipActive = true

and print:

Membership activated
Create:
deactivateMembership()

There are two conditions to think about.

If membership is already inactive:

Membership is already inactive

If the member still has borrowed books:

Cannot deactivate membership while books are borrowed

Otherwise:

membershipActive = false

and print:

Membership deactivated
Create:
borrowBook()

A book can only be borrowed when the membership is active.

If membership is inactive:

Membership is not active

Otherwise:

borrowedBooks = borrowedBooks + 1;

and print:

Book borrowed successfully
Create:
returnBook()

If:

borrowedBooks == 0

print:

No borrowed books to return

Otherwise decrease borrowedBooks by 1 and print:

Book returned successfully */
public class LibraryMember {

    private int memberId;
    private String memberName;
    private int borrowedBooks;
    private boolean membershipActive;


    public void setMemberId(int memberId) {

        if(this.memberId == 0 && memberId > 0) {

            this.memberId = memberId;

        } else {

            System.out.println(
                "Invalid Member ID or Member ID already assigned"
            );
        }
    }


    public int getMemberId() {

        return memberId;
    }


    public void setMemberName(String memberName) {

        if(memberName != null && !memberName.isEmpty()) {

            this.memberName = memberName;

        } else {

            System.out.println("Invalid member name");
        }
    }


    public String getMemberName() {

        return memberName;
    }


    public int getBorrowedBooks() {

        return borrowedBooks;
    }


    public boolean isMembershipActive() {

        return membershipActive;
    }


    public void activateMembership() {

        if(this.membershipActive) {

            System.out.println(
                "Membership is already active"
            );

        } else {

            this.membershipActive = true;

            System.out.println(
                "Membership activated"
            );
        }
    }


    public void deactivateMembership() {

        if(!this.membershipActive) {

            System.out.println(
                "Membership is already inactive"
            );

        } else if(this.borrowedBooks > 0) {

            System.out.println(
                "Cannot deactivate membership while books are borrowed"
            );

        } else {

            this.membershipActive = false;

            System.out.println(
                "Membership deactivated"
            );
        }
    }


    public void borrowBook() {

        if(!this.membershipActive) {

            System.out.println(
                "Membership is not active"
            );

        } else {

            this.borrowedBooks =
                    this.borrowedBooks + 1;

            System.out.println(
                "Book borrowed successfully"
            );
        }
    }


    public void returnBook() {

        if(this.borrowedBooks == 0) {

            System.out.println(
                "No borrowed books to return"
            );

        } else {

            this.borrowedBooks =
                    this.borrowedBooks - 1;

            System.out.println(
                "Book returned successfully"
            );
        }
    }


    public static void main(String[] args) {

        LibraryMember member = new LibraryMember();

        member.setMemberId(101);
        member.setMemberName("Pranit");

        member.activateMembership();

        member.borrowBook();
        member.borrowBook();

        System.out.println();
        System.out.println(
            "Borrowed Books: "
            + member.getBorrowedBooks()
        );


        // This should fail because books are still borrowed
        member.deactivateMembership();


        member.returnBook();
        member.returnBook();


        // Now this should succeed
        member.deactivateMembership();


        System.out.println();
        System.out.println("Member Details");

        System.out.println(
            "Member ID: " + member.getMemberId()
        );

        System.out.println(
            "Member Name: " + member.getMemberName()
        );

        System.out.println(
            "Borrowed Books: "
            + member.getBorrowedBooks()
        );

        System.out.println(
            "Membership Active: "
            + member.isMembershipActive()
        );
    }
}