import java.util.Scanner;

/**
 * arrayValue15
 */
public class arrayValue15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] finalScore = new int[10];

        //for (int i = 0; i < 10;i++ ) {
        //    System.out.print("Enter final Score " + i + ": ");
        //    finalScore[i] = sc.nextInt();
        //}

         for (int i = 0; i < finalScore.length; i++) {
                System.out.print("Enter the final score " + i + ": ");
                finalScore[i] = sc.nextInt();
         }

        //for (int i = 0; i < finalScore.length; i++) {
        //    if (finalScore[i] > 70) {
       //         System.out.println("Student " + i + " Passed! ");
        //    }
       // }

        for (int i = 0; i < finalScore.length; i++) {
            if (finalScore[i] > 70) {
                System.out.println("Student " + i + " Passed! ");
            } else {
                System.out.println("Student " + i + " Failed! ");
            }
        }
    }
}