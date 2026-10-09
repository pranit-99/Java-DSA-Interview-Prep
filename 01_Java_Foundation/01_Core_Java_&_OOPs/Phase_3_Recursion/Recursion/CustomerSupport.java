/*Now we'll introduce an important recursion concept: work before vs. after the recursive call.

Problem

A customer support system has 4 customers waiting.

Process them in order:

Serving Customer 1
Serving Customer 2
Serving Customer 3
Serving Customer 4
All Customers Served

Create:

public static void serveCustomer(int customer, int total)

No loops. */
public class CustomerSupport {
    public static void serverCustomer(int customer, int total){
        //Base Condition
        if(customer > total){
            System.out.println(" All Customers Served");
            return;
        }

        System.out.println("Serving Customer " + customer);

        serverCustomer(customer + 1, total);
    }
    public static void main(String[] args) {
        serverCustomer(1, 4);
    }
}
/*Here we need to know two things:

customer → Which customer are we currently serving?
total    → How many customers exist?

Initially:

serveCustomer(1, 4);

means:

Start with Customer 1
Total customers = 4

The total remains 4, while customer changes:

customer     total

   1           4
   ↓
   2           4
   ↓
   3           4
   ↓
   4           4
   ↓
   5           4

When:

customer = 5
total = 4

this becomes true:

if (customer > total)

so recursion stops.

Execution Trace

Start:

serveCustomer(1, 4);

First call:

customer = 1
total = 4

1 > 4? → false

Print: Serving Customer 1

serveCustomer(2, 4)

Second:

customer = 2

2 > 4? → false

Print: Serving Customer 2

serveCustomer(3, 4)

Eventually:

serveCustomer(1, 4)
        ↓
Serving Customer 1
        ↓
serveCustomer(2, 4)
        ↓
Serving Customer 2
        ↓
serveCustomer(3, 4)
        ↓
Serving Customer 3
        ↓
serveCustomer(4, 4)
        ↓
Serving Customer 4
        ↓
serveCustomer(5, 4)
        ↓
5 > 4 → TRUE
        ↓
All Customers Served
        ↓
return

Output:

Serving Customer 1
Serving Customer 2
Serving Customer 3
Serving Customer 4
All Customers Served
One important observation

Look at:

System.out.println("Serving Customer " + customer);

serveCustomer(customer + 1, total);

We are doing the work before the recursive call.

Therefore:

1 → 2 → 3 → 4

gets printed.

But recursion has an interesting property: where you place the work relative to the recursive call can completely change the result.

For example:

serveCustomer(customer + 1, total);

System.out.println("Serving Customer " + customer);

would behave differently because the print happens while recursive calls are returning.

That's an important concept called the unwinding phase of recursion. We'll introduce it gradually rather than jumping into it immediately.

For now, Problem 3 introduces another useful pattern:

One parameter changes → customer
One parameter stays fixed → total

This becomes very common in recursive methods. */