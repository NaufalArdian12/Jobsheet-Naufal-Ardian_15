import java.net.MalformedURLException;
import java.util.Scanner;

/**
 * Mid_15_Naufal
 */
public class Mid_15_Naufal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Vehicle Type (2-wheeled or 4-wheeled) : ");
        String vehicleType15 = input.nextLine();

        System.out.println("Enter number Plate : ");
        String numberPlate15 = input.nextLine();

        System.out.println("Enter duration of parking hours : ");
        int duration15 = input.nextInt();


        int fee15;
        if (vehicleType15.equals("2")) {
                fee15 = duration15 * 2000;
        }   else if (vehicleType15.equals("4")) {
                fee15 = duration15 * 4000;
        }   else {
                System.out.println("invalid vehicle type");
                return;
        }

        if (numberPlate15.startsWith("N 5")) {
            double discount = fee15 * 0.005;
            fee15 -= discount;
            
        }
        System.out.println("******* This Your Invoice *******");
        System.out.println("Vehicle type: " + vehicleType15 + " wheeled");
        System.out.println("Duration of Hours: " + duration15 + " Hours");
        System.out.println("Number plate: " + numberPlate15);
        System.out.println("fee: IDR " + fee15);
        System.out.println("******* Shankyou <3 *******");

    }
}