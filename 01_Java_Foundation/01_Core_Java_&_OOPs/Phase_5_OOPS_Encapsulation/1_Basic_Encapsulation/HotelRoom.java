/* Hotel Room

Now let's move forward. You solve this one yourself. Still Basic Encapsulation.

Create a class:

HotelRoom

with these private fields:

private int roomNumber;
private String guestName;
private boolean occupied;
Requirements
roomNumber
Must be greater than 0.
Can be assigned only once.
Provide a getter.
guestName
Provide only a getter.
Do not create setGuestName() this time.
The guest name will be controlled through checkIn().
occupied
Provide:
public boolean isOccupied()
Do not create setOccupied().
Create:
checkIn(String guestName)

It should allow check-in only when the room is not occupied.

The guest name must also not be null or empty.

When successful:

guestName = provided guest name
occupied = true

If already occupied:

Room is already occupied

If the name is invalid:

Invalid guest name
Create:
checkOut()

If the room is occupied:

guestName = null
occupied = false

Otherwise:

Room is already empty
Example
HotelRoom room = new HotelRoom();

room.setRoomNumber(205);

room.checkIn("Pranit");

System.out.println(room.getGuestName());
System.out.println(room.isOccupied());

room.checkOut();

System.out.println(room.isOccupied());

Think carefully about this problem because it introduces an important encapsulation idea while remaining basic:

We don't do:

setGuestName()
setOccupied()

Instead:

        checkIn()
           ↓
changes guestName AND occupied

        checkOut()
           ↓
changes guestName AND occupied

So one meaningful operation can safely control multiple private fields. */
public class HotelRoom {
    private int roomNumber;
    private String guestName;
    private boolean occupied;

    public void setRoomNumber(int roomNumber){
        if(this.roomNumber == 0 && roomNumber > 0){
            this.roomNumber = roomNumber;
        }else{
            System.out.println("Invalid room number or room number already assigned");
        }
    }

    public int  getRoomNumber(){
        return roomNumber;
    }

    public String getGuestName(){
        return guestName;
    }

    public boolean isOccupied(){
        return occupied;
    }

    public void checkIN(String guestName){
        if(guestName == null || guestName.isEmpty()){
            System.out.println("Invalid guest name");
        }else if(this.occupied){
            System.out.println("Room is already occupied");
        }else{
            this.guestName = guestName;
            this.occupied = true;
            System.out.println("Check-in Successful");
        }
    }

    public void checkOut(){
        if(this.occupied){
            this.guestName = null;
            this.occupied = false;

            System.out.println("Check-out successfull");
        }else{
            System.out.println("Room is already empty");
        }
    }



    public static void main(String args[]){
        HotelRoom room = new HotelRoom();room.setRoomNumber(205);

        room.checkIN("Pranit");

        System.out.println();
        System.out.println("Room Details");

        System.out.println(
            "Room Number: " + room.getRoomNumber()
        );

        System.out.println(
            "Guest Name: " + room.getGuestName()
        );

        System.out.println(
            "Occupied: " + room.isOccupied()
        );


        room.checkOut();


        System.out.println();
        System.out.println("After Checkout");

        System.out.println(
            "Guest Name: " + room.getGuestName()
        );

        System.out.println(
            "Occupied: " + room.isOccupied()
        );

    }
}
