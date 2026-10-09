/*Problem 5 of 8 — University Research Domain
UniversityMember → Student → ResearchStudent

Now we'll focus on protected members traveling through multiple inheritance levels.

The important question is:

If a field is protected in the grandparent, can the grandchild class use it directly?

Yes, subject to Java's protected access rules.

Problem Statement

Create this hierarchy:

UniversityMember
       ↓
    Student
       ↓
ResearchStudent
Level 1 — UniversityMember

Protected fields:

protected String name;
protected String universityId;

Method:

void displayMemberDetails()
Level 2 — Student

Student extends UniversityMember.

Protected fields:

protected String program;
protected double gpa;

Method:

void displayAcademicDetails()
Level 3 — ResearchStudent

ResearchStudent extends Student.

Fields:

String researchTopic;
int publishedPapers;

Create:

void displayResearchProfile()

This method should use information from all three levels. */
class UniversityMember {

    protected String name;
    protected String universityId;

    void displayMemberDetails() {

        System.out.println(
            "Student Name: " + name
        );

        System.out.println(
            "University ID: " + universityId
        );
    }
}


class Student extends UniversityMember {

    protected String program;
    protected double gpa;

    void displayAcademicDetails() {

        System.out.println(
            "Program: " + program
        );

        System.out.println(
            "GPA: " + gpa
        );
    }
}


class ResearchStudent extends Student {

    String researchTopic;
    int publishedPapers;

    void displayResearchProfile() {

        System.out.println(
            "Researcher: " + name
        );

        System.out.println(
            "Program: " + program
        );

        System.out.println(
            "Research Topic: " + researchTopic
        );

        System.out.println(
            "Published Papers: " + publishedPapers
        );
    }
}


public class UniversityResearch {

    public static void main(String[] args) {

        ResearchStudent student =
            new ResearchStudent();

        student.name = "Aarav";
        student.universityId = "CU2026";

        student.program = "Computer Science";
        student.gpa = 3.8;

        student.researchTopic =
            "Artificial Intelligence";

        student.publishedPapers = 3;

        student.displayMemberDetails();

        student.displayAcademicDetails();

        student.displayResearchProfile();
    }
}
