import java.util.Scanner;

/**
 * DoWhileLeaveEntitlement15Modifieds15
 */
public class DoWhileLeaveEntitlement15Modifieds15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement; 
        int numLeave; 
        String confirmation;

        System.out.print("Leave Entitlement: ");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("Do you want to take some time off (y/n)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Number of Leave Days: ");
                numLeave = sc.nextInt(); 

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave allowance: " + leaveEntitlement);
                } else {
                    System.out.println("Your remaining leave allowance is insufficient.");
                }
            } else if (confirmation.equalsIgnoreCase("n")) {
                System.out.println("You chose not to take leave. Program will exit.");
                break; // Exit the loop and end the program
            } else {
                System.out.println("Invalid input. Please enter 'y' or 'n'.");
            }
        } while (leaveEntitlement > 0);

        if (leaveEntitlement <= 0) {
            System.out.println("No more leave days available or your leave entitlement has been exhausted. Program will exit.");
        }
    }
}
