public class Main {
    // Method to print pairs of elements from the array
    public static void Pairs_of_Array(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int current_value = array[i];
            for (int j = i + 1; j < array.length; j++) {
                // Print pairs of elements
                System.out.print("(" + current_value +","+ array[j]+")");
            }
            System.out.println(""); // Move to the next line after printing all pairs for a given element
        }
    }

    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50, 60};
        Pairs_of_Array(array);
    }
}
