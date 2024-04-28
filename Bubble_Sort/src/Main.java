public class Main {
    public static void Bubble_Sort(int array[]) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] arges) {
        int array[] = {1, 15, 16, 4, 3, 7, 4};
        Bubble_Sort(array);

        // Printing the sorted array to verify it is sorted
        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
