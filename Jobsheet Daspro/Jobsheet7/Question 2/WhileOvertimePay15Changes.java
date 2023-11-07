import java.util.Scanner;

/**
 * WhileOvertimePay15Changes
 */
public class WhileOvertimePay15Changes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numEmployee;
        int overtimeHours;
        double overtimePay = 0;
        double totalOvertimePay = 0;
        String position;

        System.out.print("Employee Number = ");
        numEmployee = input.nextInt();

        int i = 0;
        while (i < numEmployee) {
            System.out.print("Position of employee " + (i + 1) + " (director, manager, staff) = ");
            position = input.next();

            // Check if the position is valid
            if (position.equalsIgnoreCase("director")) {
                // Handle director
                // You can add specific logic here if needed
            } else if (position.equalsIgnoreCase("manager")) {
                System.out.print("Employee " + (i + 1) + " Overtime hours = ");
                overtimeHours = input.nextInt();
                overtimePay = overtimeHours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                System.out.print("Employee " + (i + 1) + " Overtime hours = ");
                overtimeHours = input.nextInt();
                overtimePay = overtimeHours * 75000;
            } else {
                // Handle invalid position
                System.out.println("Invalid position entered for employee " + (i + 1) + ". Please enter a valid position.");
                continue; // Skip the current iteration and prompt again
            }

            totalOvertimePay += overtimePay;
            System.out.println("Total Overtime Pay = " + totalOvertimePay);
            i++;
        }
    }
}
