/*Guided Problem 7 — Online Course System

Now we'll learn a rule that often causes confusion:

An abstract class CAN have a constructor, even though we cannot directly create an object of the abstract class.

The parent constructor runs when we create an object of a concrete child class.

Problem Statement

An online learning platform provides different courses:

JavaCourse
PythonCourse

Every course has common information:

courseName
duration

Instead of assigning these values manually like we did in Problem 6, we'll initialize them using a constructor in the abstract class.

Create:

abstract class Course

with:

String courseName;
int duration;

Create a constructor:
s
Course(String courseName, int duration)

Also create an abstract method:

abstract void startCourse();

and a normal method:

void displayCourseDetails()

Then create:

JavaCourse
PythonCourse

Both should extend Course. */
abstract class Course {

    String courseName;
    int duration;


    Course(String courseName, int duration) {

        this.courseName = courseName;
        this.duration = duration;
    }


    @SuppressWarnings("unused")
    abstract void startCourse();


    void displayCourseDetails() {

        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}


class JavaCourse extends Course {

    JavaCourse(String courseName, int duration) {

        super(courseName, duration);
    }


    @Override
    void startCourse() {

        System.out.println("Java Course has started");
    }
}


class PythonCourse extends Course {

    PythonCourse(String courseName, int duration) {

        super(courseName, duration);
    }


    @Override
    void startCourse() {

        System.out.println("Python Course has started");
    }
}


public class OnlineCourseSystem {

    public static void main(String[] args) {

        JavaCourse java = new JavaCourse("Java Programming", 8);

        PythonCourse python = new PythonCourse("Python Programming", 6);


        java.displayCourseDetails();
        java.startCourse();


        System.out.println("----------------------------");


        python.displayCourseDetails();
        python.startCourse();
    }
}
