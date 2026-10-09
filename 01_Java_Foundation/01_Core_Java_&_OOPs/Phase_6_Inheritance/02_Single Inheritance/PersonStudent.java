/*Now we're introducing a major inheritance concept: constructors.

Until now, we created an object and then assigned values:

Manager manager = new Manager();

manager.employeeName = "Pranit";
manager.salary = 80000;

Now we'll initialize parent and child data using constructors.

What we're learning
Person
   ↓
Student

We'll learn:

1. Parent constructor
2. Child constructor
3. super(...)
4. Why parent constructor executes first
5. Passing data from child constructor → parent constructor
Problem Statement

Create a student management system using single inheritance.

Parent — Person

Fields:

protected String name;
protected int age;

Constructor:

Person(String name, int age)

Method:

void displayPerson()
Child — Student

Student extends Person.

Field:

String course;

Constructor:

Student(String name, int age, String course)

Use:

super(name, age);

to send the parent-related information to the Person constructor.

Create:

void displayStudent()

to display all information.

Expected Output
Person Constructor Executed
Student Constructor Executed

Name: Pranit
Age: 27
Course: Computer Science */
class Person{
    protected String name;
    protected int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Person Constructor Executed");
    }

    void displayPerson(){
        System.out.println("Name:" +name);
        System.out.println("Age:" + age);
    }
}

class Student extends Person{
    String course;
    Student(String name, int age, String course){
        super(name, age);
        this.course = course;
        System.out.println("Student Constructor Executed");
    }
    void displayStudent(){
        displayPerson();
        System.out.println("Course:" + course);
    }
}
public class PersonStudent {
    public static void main(String args[]){
        Student student = new Student("Pranit", 27, "Computer Science");
        System.out.println("");
        student.displayStudent();
    }
}
