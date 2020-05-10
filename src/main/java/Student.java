import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;       // non static variables are unique
    private int gradeYear;        // to each instance of the object student
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private static int costOfCourse = 600; // static means these variables belong
    private static int id = 1000;          // to the class as a whole


// Constructor: prompt to instruct user to enter student's name and year
    public Student() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name: ");
        this.firstName = in.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n" +
                "Enter student class level ");
        this.gradeYear = in.nextInt();

        setStudentID();

    }

//   Generate student ID with first char being their grade level
    private void setStudentID() {
        id++;
       this.studentID = gradeYear + "" + id;
    }

// Enroll in courses and increase tuition balance by $600 for each course enrolled
    public void enroll() {
        // get inside a loop, user hits 0 when done enrolling

        do {
            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else {
                break;
            }
        } while (1 != 0);
    }

// View balance
    public void viewBalance() {
        System.out.println("Your balance is $" + tuitionBalance);
    }

// Pay tuition
    public void payTuition() {
        viewBalance();
        System.out.print("Enter your payment amount: ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }


    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade level: " + gradeYear +
                "\nStudent ID: " + studentID +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;

    }
}
