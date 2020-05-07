import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;       // non static variables are unique
    private int gradeYear;        // to each instance of the object student
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600; // static means these variables belong
    private static int id = 1001;          // to the class as a whole


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
        System.out.println(firstName + " " +  lastName + " "+ gradeYear);

        // with each new student id will increment by 1
        id++;
    }


//   Generate student ID with first char being their grade level
    private String setStudentID(int length) {
       return gradeYear + " " + id;


    }

// Enroll in courses

// View balance

// Pay tuition

// Show status

}
