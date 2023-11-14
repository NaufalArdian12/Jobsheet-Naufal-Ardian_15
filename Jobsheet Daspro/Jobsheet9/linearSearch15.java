import java.util.Scanner;

public class linearSearch15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of array elements
        System.out.print("Enter the number of array elements: ");
        int numElements = sc.nextInt();

        // Input the array elements
        int[] arrayInt = new int[numElements];
        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter the array element " + i + ": ");
            arrayInt[i] = sc.nextInt();
        }

        // Input the key to search for
        System.out.print("Enter the key you want to search for: ");
        int key = sc.nextInt();

        // Perform linear search
        int result = -1; // Initialize result to -1 (not found)
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                result = i;
                break;
            }
        }

        // Output the result
        if (result != -1) {
            System.out.println("The key in the array is located at index position " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
