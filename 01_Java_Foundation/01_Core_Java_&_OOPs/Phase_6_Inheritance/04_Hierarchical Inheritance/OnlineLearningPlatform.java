class Course {

    protected String courseName;
    protected double coursePrice;

    Course(
        String courseName,
        double coursePrice
    ) {

        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    void displayCourseDetails() {

        System.out.println(
            "Course: " + courseName
        );

        System.out.println(
            "Course Price: $" + coursePrice
        );
    }
}


class ProgrammingCourse extends Course {

    String programmingLanguage;
    double labFee;

    ProgrammingCourse(
        String courseName,
        double coursePrice,
        String programmingLanguage,
        double labFee
    ) {

        super(courseName, coursePrice);

        this.programmingLanguage =
            programmingLanguage;

        this.labFee = labFee;
    }

    void calculateProgrammingCost() {

        double totalCost =
            coursePrice + labFee;

        System.out.println(
            "Language: " + programmingLanguage
        );

        System.out.println(
            "Lab Fee: $" + labFee
        );

        System.out.println(
            "Total Cost: $" + totalCost
        );
    }
}


class FinanceCourse extends Course {

    double certificationFee;

    FinanceCourse(
        String courseName,
        double coursePrice,
        double certificationFee
    ) {

        super(courseName, coursePrice);

        this.certificationFee =
            certificationFee;
    }

    void calculateFinanceCost() {

        double totalCost =
            coursePrice + certificationFee;

        System.out.println(
            "Certification Fee: $"
            + certificationFee
        );

        System.out.println(
            "Total Cost: $" + totalCost
        );
    }
}


class DesignCourse extends Course {

    double softwareFee;

    DesignCourse(
        String courseName,
        double coursePrice,
        double softwareFee
    ) {

        super(courseName, coursePrice);

        this.softwareFee =
            softwareFee;
    }

    void calculateDesignCost() {

        double totalCost =
            coursePrice + softwareFee;

        System.out.println(
            "Software Fee: $" + softwareFee
        );

        System.out.println(
            "Total Cost: $" + totalCost
        );
    }
}


public class OnlineLearningPlatform {

    public static void main(String[] args) {

        ProgrammingCourse programming =
            new ProgrammingCourse(
                "Java Backend Development",
                500,
                "Java",
                100
            );

        programming.displayCourseDetails();
        programming.calculateProgrammingCost();

        System.out.println("----------------");

        FinanceCourse finance =
            new FinanceCourse(
                "Financial Analysis",
                450,
                75
            );

        finance.displayCourseDetails();
        finance.calculateFinanceCost();

        System.out.println("----------------");

        DesignCourse design =
            new DesignCourse(
                "UI UX Design",
                400,
                50
            );

        design.displayCourseDetails();
        design.calculateDesignCost();
    }
}
