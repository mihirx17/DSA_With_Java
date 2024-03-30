import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    // Method to reverse the elements of an array
    public static void Reverse_Array(int array[]) {
        int First = 0;
        int Last = array.length - 1;
        while (First < Last) {
            // Swap elements at First and Last indices
            int temp = array[First];
            array[First] = array[Last];
            array[Last] = temp;
            // Move towards the center of the array
            First++;
            Last--;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int Input = sc.nextInt();
        int Array[] = new int[Input];

        System.out.println("Enter elements of the array:");
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }

        // Call the method to reverse the array
        Reverse_Array(Array);

        System.out.println("Reversed array:");
        for (int i = 0; i < Array.length; i++) {
            System.out.print(" "+ Array[i] +"");
        }
    }
}
