public class Main {
    public static void Insertion_Sort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 10, 2, 4, 9};
        Insertion_Sort(array); // Sorting the array

        // Printing the sorted array to verify it is sorted
        System.out.print("Sorted array: ");
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
