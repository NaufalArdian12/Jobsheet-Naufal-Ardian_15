import java.util.Scanner;

/**
 * DoWhileLeaveEntitlement15
 */
public class DoWhileLeaveEntitlement15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int leaveEntitlement; 
        int numLeave;
        String confirmation;

        System.out.print("leave Entitlement : ");
        leaveEntitlement = sc.nextInt();
        
        do {
            System.out.print("“Would you like to take some time off (y/n)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("Leave Number : ");
                numLeave = sc.nextInt();

                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave allowance : " + leaveEntitlement);

                } else {
                    System.out.println("Your remaining leave allowance is insufficient");
                    break;
                }
                    
                }
                
            } while (leaveEntitlement > 0);
        }

    }
