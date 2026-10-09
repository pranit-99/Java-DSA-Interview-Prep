/*Until now we've mostly stored:

String
Integer

But a List can store your own Java objects too.

Suppose we have an Employee class. */
import java.util.ArrayList;
import java.util.List;

class Employee {

    private int id;
    private String name;

    public Employee(int id, String name) {

        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "John"));
        employees.add(new Employee(102, "Sarah"));
        employees.add(new Employee(103, "David"));

        for (Employee employee : employees) {

            System.out.println(
                    employee.getId()
                    + " - "
                    + employee.getName()
            );
        }
    }
}