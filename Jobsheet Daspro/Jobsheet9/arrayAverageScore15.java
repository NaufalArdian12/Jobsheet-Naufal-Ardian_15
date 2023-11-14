import java.util.Scanner;

public class arrayAverageScore15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();

        int[] score = new int[numStudents];
        double totalPassed = 0;
        double totalFailed = 0;
        int passedCount = 0;  // Counter for students who passed
        int failedCount = 0;  // Counter for students who failed

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the final score " + i + ": ");
            score[i] = sc.nextInt();

            // Check if the student passed or failed
            if (score[i] > 70) {
                totalPassed += score[i];
                passedCount++;
            } else {
                totalFailed += score[i];
                failedCount++;
            }
        }

        double averagePassed = (passedCount > 0) ? totalPassed / passedCount : 0;
        double averageFailed = (failedCount > 0) ? totalFailed / failedCount : 0;

        System.out.println("The average score of students who passed is " + averagePassed);
        System.out.println("The average score of students who failed is " + averageFailed);
    }
}