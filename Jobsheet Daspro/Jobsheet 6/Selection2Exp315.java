import java.util.Scanner;

public class Selection2Exp315 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in); 
        
        String category; 
        int income, netSalary;
        double tax = 0; 
        
        System.out.print("input category : "); 

        category = input15.nextLine(); 

        System.out.print("input income : "); 

        income = input15.nextInt(); 

        if (category.equals("worker")) {

            if (income<=2000000) 
            tax = 0.1; 

            else if(income<= 3000000) 
            tax = 0.15; 

            else
            tax = 0.2;

            netSalary = (int) (income - (tax* income)); 
            System.out.println("nett salary : "+netSalary); 

        } else if(category.equals("bussinesman")){ 
            
            if (income<=2500000)
            tax = 0.15; 

            else if(income<= 3500000) 
            tax = 0.2;

            else tax = 0.25; 

            netSalary = (int) (income - (tax* income)); 
            System.out.println("nett salary : "+netSalary); 

        }else System.out.println("invalid category");
    }
}
