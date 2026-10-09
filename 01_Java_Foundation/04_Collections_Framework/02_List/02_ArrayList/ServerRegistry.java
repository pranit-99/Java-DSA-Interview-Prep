/*ArrayList — Basic Problem 3: Dynamic Growth

Now we'll understand one of the most important features of ArrayList:

How can an ArrayList keep accepting elements when its current internal storage becomes insufficient?

Problem Statement

Create a Server Name Registry with an initial capacity of 3.

Add:

Server-1
Server-2
Server-3
Server-4
Server-5
Server-6

Even though the initial capacity is only 3, verify that all 6 elements can be added.*/
import java.util.ArrayList;
public class ServerRegistry {
    public static void main(String args[]){
        //Initial Capacity = 3
        ArrayList<String> servers = new ArrayList<>();
        servers.add("Server-1");
        servers.add("Server-2");
        servers.add("Server-3");

        System.out.println("After adding 3 servers:");
        System.out.println(servers);
        System.out.println("Size: " + servers.size());

        // Adding more than the initial capacity
        servers.add("Server-4");
        servers.add("Server-5");
        servers.add("Server-6");

        System.out.println("\nAfter adding 6 servers:");
        System.out.println(servers);
        System.out.println("Size: " + servers.size());
    }
}
