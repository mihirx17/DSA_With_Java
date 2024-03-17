import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int Array[] = {1, 3, 45, 5, 45, 3, 24, 55};
        int duplicateIndices[] = new int[Array.length]; // Array to store indices of duplicate elements
        int count = 0; // Counter for duplicate elements

        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    duplicateIndices[count++] = j; // Store the index of duplicate element
                }
            }
        }

        System.out.println("Indices where same values are present:");
        for (int i = 0; i < count; i++) {
            System.out.println("Index: " + duplicateIndices[i]);
        }
        System.out.println("Total_Number of duplicate element " + count);
    }
}
