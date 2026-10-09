
/*Problem

A delivery driver has to visit 4 delivery stops.

While going:

Going to Stop 1
Going to Stop 2
Going to Stop 3
Going to Stop 4
All Deliveries Completed

After completing the deliveries, the driver returns through the stops in reverse order:

Returning from Stop 4
Returning from Stop 3
Returning from Stop 2
Returning from Stop 1

We want:

Going to Stop 1
Going to Stop 2
Going to Stop 3
Going to Stop 4
All Deliveries Completed
Returning from Stop 4
Returning from Stop 3
Returning from Stop 2
Returning from Stop 1

No loops.

*/
public class DeliveryRoute {

    public static void deliver(int stop, int total) {

        // Base condition
        if (stop > total) {
            System.out.println("All Deliveries Completed");
            return;
        }

        // Work BEFORE recursive call
        System.out.println("Going to Stop " + stop);

        // Recursive call
        deliver(stop + 1, total);

        // Work AFTER recursive call
        System.out.println("Returning from Stop " + stop);
    }

    public static void main(String[] args) {

        deliver(1, 4);
    }
}
/*The most important part

Look carefully at these three lines:

System.out.println("Going to Stop " + stop);

deliver(stop + 1, total);

System.out.println("Returning from Stop " + stop);

We have:

BEFORE recursion
      ↓
Recursive call
      ↓
AFTER recursion

The code before the recursive call executes while we're going deeper:

1 → 2 → 3 → 4

The code after the recursive call executes while we're coming back:

4 → 3 → 2 → 1

This "coming back" is called unwinding.

Let's trace it slowly

We start:

deliver(1, 4);
Call 1
stop = 1

Print:
Going to Stop 1

Call:
deliver(2, 4)

But notice something important.

Java has not yet executed:

System.out.println("Returning from Stop " + stop);

Why?

Because before reaching that line, Java encounters:

deliver(2, 4);

So Java enters the next method call first.

Call 2

Now:

stop = 2

Print:
Going to Stop 2

Call:
deliver(3, 4)

Again, Java waits before printing:

Returning from Stop 2

Then:

deliver(3, 4)

does the same.

Eventually:

Going to Stop 1
      ↓
Going to Stop 2
      ↓
Going to Stop 3
      ↓
Going to Stop 4
      ↓
deliver(5, 4)

Now:

if (stop > total)

becomes:

5 > 4 → true

So:

All Deliveries Completed

is printed and:

return;

executes.

Now something interesting happens

Where does Java return?

It returns to the previous method call:

deliver(4, 4)

And specifically, it continues after this line:

deliver(stop + 1, total);

So now it executes:

System.out.println("Returning from Stop " + stop);

For that method call:

stop = 4

Therefore:

Returning from Stop 4

Then deliver(4,4) finishes.

Java returns to:

deliver(3,4)

and prints:

Returning from Stop 3

Then:

Returning from Stop 2

Then:

Returning from Stop 1
Visualize the complete flow
deliver(1)
   |
   | Going 1
   ↓
deliver(2)
   |
   | Going 2
   ↓
deliver(3)
   |
   | Going 3
   ↓
deliver(4)
   |
   | Going 4
   ↓
deliver(5)
   |
   | BASE CONDITION
   | All Deliveries Completed
   ↓
   return
   ↑
Returning 4
   ↑
Returning 3
   ↑
Returning 2
   ↑
Returning 1

So the output is:

Going to Stop 1
Going to Stop 2
Going to Stop 3
Going to Stop 4
All Deliveries Completed
Returning from Stop 4
Returning from Stop 3
Returning from Stop 2
Returning from Stop 1
The rule I want you to remember

This is one of the most important recursion rules:

Code BEFORE recursive call
        ↓
Executes while going deeper
        ↓
1 2 3 4


Code AFTER recursive call
        ↓
Executes while coming back
        ↓
4 3 2 1

That second part:

4 → 3 → 2 → 1

is the unwinding phase.

We'll use this concept repeatedly, especially when we start recursive methods that return values. */