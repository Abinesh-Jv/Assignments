import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score : ");
        int score = sc.nextInt();
        String grade;
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid score";
        }
        System.out.println("The student's grade is: " + grade);
    }
}

