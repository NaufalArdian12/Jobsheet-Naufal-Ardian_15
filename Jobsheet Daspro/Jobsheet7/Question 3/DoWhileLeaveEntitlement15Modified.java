import java.util.Scanner;

/**
 * DoWhileLeaveEntitlement15Modified
 */
public class DoWhileLeaveEntitlement15Modified {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement; 
        int numLeave;
        String confirmation;

        System.out.print("Leave Entitlement: ");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("Would you like to take some time off (y/n)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave Number: ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave allowance: " + leaveEntitlement);
                } else {
                    System.out.println("Your remaining leave allowance is insufficient.");
                }
            } else {
                break; // Exit the loop if the user doesn't want to take time off
            }
        } while (leaveEntitlement > 0);

        System.out.println("No more leave days available or you chose not to take time off. Exiting.");
    }
}
