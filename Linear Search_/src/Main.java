import java.util.Scanner;

public class Main {
    public static int linear_search(int number[], int Key_check) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == Key_check) {
                return 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int Array[] = {10, 20, 30, 40, 55, 55, 66, 89};
        while (true) {
            System.out.println("Enter Your key values..");
            Scanner sc = new Scanner(System.in);
            int key = sc.nextInt();
            int save_index_values;
            save_index_values = linear_search(Array, key);
            if (save_index_values == 1) {
                System.out.println("Key has been Found..");
            } else {
                System.out.println("Key has been not found..");
            }
        }
    }
}