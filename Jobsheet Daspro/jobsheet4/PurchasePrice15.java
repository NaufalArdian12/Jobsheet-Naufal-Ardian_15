import java.util.Scanner;
/**
 * PurchasePrice15
 */
public class PurchasePrice15 {

    public static void main(String[] args) {

    Scanner input =new Scanner(System.in);
    int price, quantity;
    double discount = 0.1;
    double totalprice, PurchasePrice, totaldiscount;
    String brand;
    String type;

    System.out.println("what is the type of that book? ");
    type = input.nextLine();
    System.out.println("what is the name of that book? ");
    brand = input.nextLine();
    System.out.println("Input Price: ");
    price =input.nextInt();
    System.out.println("Input Quantity: ");
    quantity =input.nextInt();

    totalprice = price * quantity;
    totaldiscount = totalprice * discount;
    PurchasePrice = totalprice - totaldiscount;
    
    System.out.println("total discount: " + totaldiscount);
    System.out.println("final purchase price " + PurchasePrice);
    System.out.println("type book " + type + " book name " + brand + " the total is " + PurchasePrice + " dollars");
    }
}