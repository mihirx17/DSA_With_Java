public class Main {
    public static void findIndicesOfTwoNumbers(int array[], int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    System.out.println("Indices: " + i + ", " + j);
                    return; // Assuming you want to find only one pair
                }
            }
        }
        System.out.println("Indices not found");
    }

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        findIndicesOfTwoNumbers(array, 4);
    }
}
