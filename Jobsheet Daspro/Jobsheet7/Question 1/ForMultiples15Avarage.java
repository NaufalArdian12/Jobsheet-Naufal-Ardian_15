import java.util.Scanner;

public class ForMultiples15Avarage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int multiple;
        int sum = 0;
        int counter = 0;
        double average = 0.0; // new variable to store the average

        System.out.print("Input the multiple = ");
        multiple = input.nextInt();

        for (int i=1;i<=50;i++){
            if (i%multiple == 0) {
                sum = sum + i;
                counter++;     
            }
        }
        average = (double) sum / counter; // calculate the average
        System.out.printf("There are %d numbers that are multiple of %d in range 1 to 50. \n", counter, multiple);
        System.out.printf("The sum from all multiples of %d in range 1 s.d. 50 is %d. \n", multiple, sum);
        System.out.printf("The average of all multiples of %d in range 1 s.d. 50 is %.2f. \n", multiple, average); // print the average with 2 decimal places
    }
}