/*Movie Theater Seat Counter

Now you will solve this one yourself. I will not provide the solution unless you ask for it.

We are staying at the Basic level.

Problem Statement

A movie theater wants a small system to manage the number of available seats for a particular movie show.

Create a class:

MovieShow

The class should contain:

showId
movieName
availableSeats
Requirements
All fields must be private.
showId
Must be greater than 0.
Can be assigned only once.
Can be viewed using a getter.
movieName
Can be viewed and changed.
Cannot be null or empty.
availableSeats
Can be viewed using a getter.
Should not have a normal setter.
Create:
addSeats(int seats)

It should:

Accept only a number greater than 0.
Add the seats to the existing availableSeats.
Otherwise print:
Invalid number of seats
Create:
bookSeats(int seats)

It should check:

seats must be greater than 0.
The requested seats cannot be greater than availableSeats.
If valid, subtract the requested seats from availableSeats.
If the requested number is greater than available seats, print:
Not enough seats available
If the number is 0 or negative, print:
Invalid booking quantity
Example Scenario

Your main() should test something similar to:

Show ID = 501
Movie Name = Interstellar

Add 20 seats

Book 4 seats

Available Seats = 16

Also test at least one invalid booking, such as trying to book more seats than are available. */
public class MovieShow {
   private int ShowID;
   private String movieName;
   private int availableSeats;

   public void setShowID(int ShowID){
    if(this.ShowID == 0 && ShowID > 0){
        this.ShowID = ShowID;
    }else{
        System.out.println("ShowID is invalid or Already Assigned");
    }
   }

   public int getShowID(){
    return ShowID;
   }

   public void setmovieName(String movieName){
    if(movieName != null && !movieName.isEmpty()){
        this.movieName = movieName;
    }else{
        System.out.println("Movie Name is already Assigned");
    }
   }

   public String getmovieName(){
    return movieName;
   }

   public int getAvailableSeats(){
    return availableSeats;
   }

   public void addSeats(int seats){
    if(seats > 0){
        this.availableSeats = this.availableSeats + seats;
        System.out.println(seats + "Seats Added Successfully");
    }else{
        System.out.println("Invalid Number of Seats");
    }
   }

   public void bookSeats(int seats){
    if(seats <= 0){
        System.out.println("Invalid booking quantity");
    }else if(seats > this.availableSeats){
        System.err.println("Not Enough seats available");
    }else{
        this.availableSeats = this.availableSeats - seats;
        System.out.println(seats + " seats booked successfully");
    }
   }


   
   public static void main(String[] args) {
       MovieShow movie = new MovieShow();
       movie.setShowID(105);
       movie.setmovieName("Interstellar");
       movie.addSeats(20);
       movie.bookSeats(4);

       System.out.println();

        System.out.println("Movie Show Details");

        System.out.println(
            "Show ID: " + movie.getShowID()
        );

        System.out.println(
            "Movie Name: " + movie.getmovieName()
        );

        System.out.println(
            "Available Seats: " + movie.getAvailableSeats()
        );


        // Invalid booking test

        System.out.println();

        movie.bookSeats(25);

   }

}
