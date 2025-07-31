import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter your Personal Info");


        System.out.print("Enter your Student ID: ");
        String studentID = input.nextLine();


        System.out.print("Enter your First Name: ");
        String firstName = input.nextLine();


        System.out.print("Enter your Last Name: ");
        String lastName = input.nextLine();


        System.out.print("Enter your Course: ");
        String course = input.nextLine();


        System.out.print("Enter your Section: ");
        String section = input.nextLine();


        System.out.println("STUDENT INFORMATION");
        System.out.println("Student ID: " + studentID);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);


        System.out.println("Enter your Scores (Out of 100 each):");


        System.out.print("Enter your Midterm Exam Score: ");
        int midTermExamScore = input.nextInt();


        System.out.print("Enter your Final Exam Score: ");
        int finalExamScore = input.nextInt();


        System.out.print("Enter your Project Score: ");
        int projectScore = input.nextInt();


        System.out.print("Enter your Attendance Score: ");
        int attendanceScore = input.nextInt();


        int totalScore = midTermExamScore + finalExamScore + projectScore + attendanceScore;
        int averageScore = (totalScore * 100) / 400;


        System.out.println("STUDENT SCORES");
        System.out.println("Midterm Exam Score: " + midTermExamScore);
        System.out.println("Final Exam Score: " + finalExamScore);
        System.out.println("Project Score: " + projectScore);
        System.out.println("Attendance Score: " + attendanceScore);


        System.out.println("Average Score: " + averageScore + "%");


        if (averageScore < 75) {
            System.out.println("Remarks: FAILED");
        } else {
            System.out.println("Remarks: PASSED");
        }


        input.close();
    }
}
