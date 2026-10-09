/*Scenario
A parking lot has 10 parking spaces.
The following array represents the parking spaces:
int[] parking = {1, 0, 1, 1, 0, 0, 1, 0, 1, 0};
Where:
1 = Occupied
0 = Available
Create a non-recursive void method:
public static void checkParking(int[] parking) */
public class ParkingLot {
    public static void checkParking(int parking[]){
        int Occupied_count = 0;
        int Available_count = 0;
        int parking_Space = 1;
        
        for(int i = 0; i < parking.length; i++){
            if(parking[i] == 1){
                System.out.println("Parking Space " + parking_Space +" :"+" Occupied");
                parking_Space++;
                Occupied_count = Occupied_count + 1;
            }else{
                System.out.println("Parking Space " + parking_Space +" :"+" Available");
                parking_Space++;
                Available_count = Available_count + 1;
            }
        }
        System.err.println("Total Available Spaces:" +Available_count);
        System.err.println("Total Occupied Spaces:" +Occupied_count);

    }
    public static void main(String args[]){
        int parking[] = {1,0,1,1,0,0,1,0,1,0};
        checkParking(parking);
    }
}
