import java.util.Scanner;

/**
 * WhileOvertimePay15
 */
public class WhileOvertimePay15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numEmployee;
        int overtimeHours;
        double overtimePay = 0;
        double totalOvertimePay = 0;
        String posotion;

        System.out.print("Employee Number = ");
        numEmployee = input.nextInt();


        int i=0;
        while (i<numEmployee) {
            System.out.print("Position of employee " + (i+1) + " (director, manager, staff) = ");
            posotion = input.next();
            System.out.print("Employee " + (i+1) +" Overtime hours = ");
            overtimeHours = input.nextInt();
            i++;

            if (posotion.equalsIgnoreCase("director")) {
                continue;
            }else if (posotion.equalsIgnoreCase("manager")) {
                overtimePay = overtimeHours*100000;
            }else if (posotion.equalsIgnoreCase("staff")) {
                overtimePay = overtimeHours*75000;
            }

            totalOvertimePay += overtimePay;
                System.out.println("Total Overtime Pay = " + totalOvertimePay);     
            }
                
        }

    }