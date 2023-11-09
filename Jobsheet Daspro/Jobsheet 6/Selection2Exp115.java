import java.util.Scanner;

/**
  * Selection2Exp115
  */
 public class Selection2Exp115 {
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);

        int year;
        System.out.println("What Year ? ");

        year = input15.nextInt();

        if (year % 4 == 0) {
           if (year % 100 != 0) {
            if (year % 400 == 0) {
                System.out.println("Leap Year");
              } else {
                System.out.println("Not A Leap Year");
                }
            } else {
            System.out.println("Leap Year");
          }
           
      } else {
        System.out.println("Not A Leap Year");
        }

//        if (year % 4 == 0) {
//           if (year % 100 != 0) {
//                System.out.println("Leap Year");
//           } else {
//               System.out.println("Not Leap Year");
//           }
           
//      } else {
//        System.out.println("Not A Leap Year");
//        }
            
        }
    }