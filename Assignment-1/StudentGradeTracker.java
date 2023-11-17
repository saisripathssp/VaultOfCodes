import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of students and subjects
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Student data arrays
        String[] studentNames = new String[numStudents];
        double[][] studentGrades = new double[numStudents][numSubjects];

        // Input students' names
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter name for Student " + (i + 1) + ": ");
            studentNames[i] = scanner.next();
        }

        // Input grades for each student and subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("\nEnter grades for " + studentNames[i] + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Enter grade for Subject " + (j + 1) + ": ");
                studentGrades[i][j] = scanner.nextDouble();
            }
        }

        // Display list of students along with their grades
        System.out.println("\nList of Students and Grades:");
        for (int i = 0; i < numStudents; i++) {
            System.out.print(studentNames[i] + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": " + studentGrades[i][j] + "  ");
            }
            System.out.println();
        }

        // Calculate and display the average grade of all students
        double totalAverage = 0;
        for (int i = 0; i < numStudents; i++) {
            double sum = 0;
            for (int j = 0; j < numSubjects; j++) {
                sum += studentGrades[i][j];
            }
            double average = sum / numSubjects;
            totalAverage += average;
            System.out.println(studentNames[i] + "'s Average Grade: " + average);
        }

        System.out.println("\nOverall Average Grade: " + (totalAverage / numStudents));

        scanner.close();
    }
}

