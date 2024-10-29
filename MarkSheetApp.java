import java.util.Scanner;

public class MarkSheetApp {
    private String studentName;
    private double totalMarks;
    private double obtainedMarks;
    private double percentage;
    private char grade;
    private double gpa;

    public MarkSheetApp(String studentName, double totalMarks, double obtainedMarks) {
        this.studentName = studentName;
        this.totalMarks = totalMarks;
        this.obtainedMarks = obtainedMarks;
        calculatePercentage();
        assignGradeAndGPA();
    }

    private void calculatePercentage() {
        this.percentage = (obtainedMarks / totalMarks) * 100;
    }

    private void assignGradeAndGPA() {
        if (percentage >= 90) {
            grade = 'A';
            gpa = 4.0;
        } else if (percentage >= 80) {
            grade = 'B';
            gpa = 3.0;
        } else if (percentage >= 70) {
            grade = 'C';
            gpa = 2.0;
        } else if (percentage >= 60) {
            grade = 'D';
            gpa = 1.0;
        } else {
            grade = 'F';
            gpa = 0.0;
        }
    }

    public void displayMarkSheet() {
        System.out.println("\n----- Mark Sheet -----");
        System.out.println("Student Name: " + studentName);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Total Marks: ");
        double totalMarks = scanner.nextDouble();
        System.out.print("Enter Obtained Marks: ");
        double obtainedMarks = scanner.nextDouble();

        MarkSheetApp markSheet = new MarkSheetApp(name, totalMarks, obtainedMarks);
        markSheet.displayMarkSheet();
    }
}
